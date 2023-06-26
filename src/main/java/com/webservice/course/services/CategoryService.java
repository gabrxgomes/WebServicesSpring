package com.webservice.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.course.entities.Category;
import com.webservice.course.repositories.CategoryRepository;

@Service // fica mais semanticamente correto
//@Component //registra a minha classe user service como uma classe do spring oque ajuda a receber as funções do autowired
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
