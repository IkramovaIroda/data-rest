package com.example.datarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //Column length=14 jpa
    //Size javax validation
    //Length hibernate validation
    @Column(length = 14, nullable = false)
//    @Size(min = 13, max = 14)
//    @Length(min = 1, max = 4)
    private String name;

    @Column(length = 3, nullable = false)
    private String country;

    //var 255 default -> text
    @Column(columnDefinition = "text")
    private String address;

    @Column(length = 50)
    private String phone;
}
