package com.example.datarest.repository;


import com.example.datarest.entity.Category;
import com.example.datarest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
