package com.webservice.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.course.entities.Product;
import com.webservice.course.services.ProductService;

@RestController 
@RequestMapping(value = "/products")
public class ProductResource {
	
	//criando o metodo que sera o endpoint para pegar informações referentes aos meus usuarios
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		//Product u = new Product(1L, "Joana", "joana@gmail.com", "99999999", "12345");
		List<Product> list = service.findAll();
				
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
