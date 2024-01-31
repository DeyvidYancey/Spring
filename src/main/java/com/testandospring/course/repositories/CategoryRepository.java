package com.testandospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testandospring.course.entities.Category;
import com.testandospring.course.entities.Order;
import com.testandospring.course.entities.User;

public interface CategoryRepository extends  JpaRepository<Category,Long>{

	
}
