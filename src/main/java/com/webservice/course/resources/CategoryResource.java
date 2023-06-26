package com.webservice.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.course.entities.Category;
import com.webservice.course.services.CategoryService;

@RestController 
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	//criando o metodo que sera o endpoint para pegar informações referentes aos meus usuarios
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		//Category u = new Category(1L, "Joana", "joana@gmail.com", "99999999", "12345");
		List<Category> list = service.findAll();
				
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
