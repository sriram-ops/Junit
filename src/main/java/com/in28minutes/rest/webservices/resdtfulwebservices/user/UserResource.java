package com.in28minutes.rest.webservices.resdtfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	 

	@Autowired
	private UserDAOService service;

	@GetMapping("/users")
	public List<User> retriveAll() {

		return service.findAll();
	}

	@GetMapping("/users/{id}")
	public User retriveUserid(@PathVariable int id) {
		return service.findOne(id);

	}
	
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		
		    User savedUser  =  service.saveUser(user);
		
		 URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(savedUser.getId()).toUri();
	    
		 
		return ResponseEntity.created(location).build();
	
	}

}
