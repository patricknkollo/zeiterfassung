package com.projection.demo.controllers;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.projection.demo.entities.User;
import com.projection.demo.services.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/api/user")
public class UserAlternativController {

	@Autowired
	UserService service;

	@RequestMapping(path = "/save/user", method = RequestMethod.POST)
	public @ResponseBody User speichern(@RequestBody User user) {
		User optionalUser = service.enregistrer(user);
		return optionalUser;
	}

	@RequestMapping(path = "/select/users", method = RequestMethod.GET)
	public @ResponseBody List<User> selectAllUser(){
		List<User> users = service.selectAllUser();
		return users;
	}
	
	@RequestMapping(path = "/select/users2", method = RequestMethod.GET)
	public @ResponseBody List<User> selectAllUser2(){
		List<User> users = service.selectAllUser();
		return users;
	}

	@RequestMapping(path = "/select/user/{userid}", method = RequestMethod.GET)
	public @ResponseBody Optional<User> selectUserById(@PathVariable("userid") Long id) {
		Optional<User> user = service.selectUserById(id);
		return user;
	}


	
	  @RequestMapping(path = "/selectuserwithname/{onename}", method = RequestMethod.GET)
	  public  @ResponseBody Optional<User> userWithName(@PathVariable("onename") String name){
	  Optional<User> user = service.selectUserWithTheName(name); 
	  return user;
	  
	  }


	@RequestMapping(path = "/selectuserwithfirstname/{onefirstname}", method = RequestMethod.GET)
	@Transactional public @ResponseBody Optional<User>userWithFirstame(@PathVariable("onefirstname") String vorname){ 
		Optional<User> user = service.selectUserWithThVorname(vorname);
		return user;
	}
}
