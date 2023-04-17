package com.carlos.estudo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.estudo.entities.User;

@RestController
@RequestMapping(value ="/users")
public class UserControllers {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@email.com", "9999999", "123456" );
		return ResponseEntity.ok().body(u);
		
	}
}
