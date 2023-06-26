package com.webservice.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.course.entities.Order;
import com.webservice.course.services.OrderService;

@RestController 
@RequestMapping(value = "/orders")
public class OrderResource {
	
	//criando o metodo que sera o endpoint para pegar informações referentes aos meus usuarios
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		//Order u = new Order(1L, "Joana", "joana@gmail.com", "99999999", "12345");
		List<Order> list = service.findAll();
				
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
