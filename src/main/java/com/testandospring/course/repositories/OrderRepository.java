package com.testandospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testandospring.course.entities.Order;
import com.testandospring.course.entities.User;

public interface OrderRepository extends  JpaRepository<Order,Long>{

	
}
