package com.webservice.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.course.entities.User;

@RestController 
@RequestMapping(value = "/users")
public class UserResource {
	
	//criando o metodo que sera o endpoint para pegar informações referentes aos meus usuarios
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Joana", "joana@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
