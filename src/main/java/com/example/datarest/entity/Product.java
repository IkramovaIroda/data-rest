package com.example.datarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10)
    private String name;

    @ManyToOne
    private Category category;

    @Column(length = 20)
    private String description;

    //precision umumiy 6 xonali son 2 xona maydasi bor
    @Column(precision = 6, scale = 2)
    private BigDecimal price;

    @Column(length = 1024)
    private String photo;
}
