package com.projection.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projection.demo.entities.User;
import com.projection.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public User enregistrer(User user) {
		return repository.save(user);
	}
	
	public List<User> selectAllUser(){
		return repository.findAll();
	}
	public Optional<User> selectUserById(Long id) {
		return repository.findById(id);
	}
	
    public Optional<User> selectUserWithTheName(String name){
    	return repository.findAllUserWithNameLike(name);
    }
    
	
	  public Optional<User>selectUserWithThVorname(String vorname){ 
		  return repository.findAllUserWithVorameLike(vorname); }
	 
}
