package com.testandospring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.testandospring.course.entities.User;
import com.testandospring.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		// repository.findById(id) returns an Optional<User>

		Optional<User> obj = repository.findById(id);

		// obj.get() retrieves the value from the Optional
		return obj.get();
	}

}
