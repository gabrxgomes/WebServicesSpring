package com.webservice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	//só com o instanciamento basico ja temos preparado um objeto que tera varias operações para mexer
	//com o usuario
	
	
	

}
