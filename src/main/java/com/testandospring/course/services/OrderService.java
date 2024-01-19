package com.testandospring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.testandospring.course.entities.Order;

import com.testandospring.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		// repository.findById(id) returns an Optional<Order>

		Optional<Order> obj = repository.findById(id);

		// obj.get() retrieves the value from the Optional
		return obj.get();
	}

}
