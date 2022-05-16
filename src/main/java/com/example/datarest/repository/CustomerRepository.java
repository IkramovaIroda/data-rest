package com.example.datarest.repository;


import com.example.datarest.entity.Category;
import com.example.datarest.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "customer")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
