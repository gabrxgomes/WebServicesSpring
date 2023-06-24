package com.webservice.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.course.entities.User;
import com.webservice.course.services.UserService;

@RestController 
@RequestMapping(value = "/users")
public class UserResource {
	
	//criando o metodo que sera o endpoint para pegar informações referentes aos meus usuarios
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		//User u = new User(1L, "Joana", "joana@gmail.com", "99999999", "12345");
		List<User> list = service.findAll();
				
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
