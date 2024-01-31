package com.testandospring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.testandospring.course.entities.Category;
import com.testandospring.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		// repository.findById(id) returns an Optional<Category>

		Optional<Category> obj = repository.findById(id);

		// obj.get() retrieves the value from the Optional
		return obj.get();
	}

}
