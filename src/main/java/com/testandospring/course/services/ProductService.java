package com.testandospring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.testandospring.course.entities.Product;
import com.testandospring.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		// repository.findById(id) returns an Optional<Product>

		Optional<Product> obj = repository.findById(id);

		// obj.get() retrieves the value from the Optional
		return obj.get();
	}

}
