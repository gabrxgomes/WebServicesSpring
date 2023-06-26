package com.webservice.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.course.entities.Order;
import com.webservice.course.repositories.OrderRepository;

@Service // fica mais semanticamente correto
//@Component //registra a minha classe user service como uma classe do spring oque ajuda a receber as funções do autowired
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
