package com.webservice.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.course.entities.Product;
import com.webservice.course.repositories.ProductRepository;

@Service // fica mais semanticamente correto
//@Component //registra a minha classe user service como uma classe do spring oque ajuda a receber as funções do autowired
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
