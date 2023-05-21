package com.example.demo.REPOSITORY;

import com.example.demo.ENTITY.OrderReturn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderReturn,Long> {
}
