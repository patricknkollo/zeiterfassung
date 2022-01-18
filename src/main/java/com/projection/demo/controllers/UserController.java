package com.projection.demo.controllers;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projection.demo.entities.User;
import com.projection.demo.services.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService service;

	//@RequestMapping(path = "/save/user", method = RequestMethod.POST)
	@Transactional
	public ResponseEntity<User> speichern(@RequestBody User user) {
		User optionalUser = service.enregistrer(user);
		return new ResponseEntity<User>(optionalUser, HttpStatus.OK);
	}

	//@RequestMapping(path = "/select/users", method = RequestMethod.GET)
	@Transactional
	public @ResponseBody ResponseEntity<List<User>> selectAllUser(){
		List<User> users = service.selectAllUser();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	//@RequestMapping(path = "/select/users2", method = RequestMethod.GET)
	@Transactional
	public @ResponseBody List<User> selectAllUser2(){
		List<User> users = service.selectAllUser();
		return users;
	}

	//@RequestMapping(path = "/select/user/{userid}", method = RequestMethod.GET)
	@Transactional
	public @ResponseBody ResponseEntity<Optional<User>> selectUserById(@PathVariable("userid") Long id) {
		Optional<User> user = service.selectUserById(id);
		return new ResponseEntity<Optional<User>>(user, HttpStatus.OK);
	}


	
	 // @RequestMapping(path = "/selectuserwithname/{onename}", method = RequestMethod.GET)
	  @Transactional 
	  public  @ResponseBody Optional<User> userWithName(@PathVariable("onename") String name){
	  Optional<User> user = service.selectUserWithTheName(name); 
	  return user;
	  //ResponseEntity<List<User>>(users, HttpStatus.OK);
	  }
	 
	  
	/*
	 * @RequestMapping(path = "/selectuserwithname/{onename}", method =
	 * RequestMethod.GET)
	 * 
	 * @Transactional public @ResponseBody
	 * ResponseEntity<List<User>>userWithName(@PathVariable("onename") String name){
	 * List<User>users = service.selectUserWithTheName(name); return new
	 * ResponseEntity<List<User>>(users, HttpStatus.OK);}
	 */


//	@RequestMapping(path = "/selectuserwithfirstname/{onefirstname}", method = RequestMethod.GET)
	@Transactional public @ResponseBody ResponseEntity<Optional<User>>userWithFirstame(@PathVariable("onefirstname") String vorname){ 
		Optional<User> user = service.selectUserWithThVorname(vorname);
		return new ResponseEntity<Optional<User>>(user, HttpStatus.OK);
		
	}


}
