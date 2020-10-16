package com.backendproject.course.repositories;

import com.backendproject.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
