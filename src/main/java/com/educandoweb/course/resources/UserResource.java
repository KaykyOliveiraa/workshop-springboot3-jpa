package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController //Mostra que a classe é um recurso web, Implementado por um controlador Rest
@RequestMapping(value = "/users") //Anotation que da o nome do recurso
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "999999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
