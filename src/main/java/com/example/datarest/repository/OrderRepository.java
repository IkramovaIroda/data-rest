package com.example.datarest.repository;


import com.example.datarest.entity.Category;
import com.example.datarest.entity.Order;
import com.example.datarest.projection.CustomOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "order", excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
