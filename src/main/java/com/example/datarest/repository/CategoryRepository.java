package com.example.datarest.repository;


import com.example.datarest.entity.Category;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "category")
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    //yangi path yozish
    //search /name
    @RestResource(path = "/name")
    List<Category> findAllByNameContainingIgnoreCase(@Param("") String name);

}
