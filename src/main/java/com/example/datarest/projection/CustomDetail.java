package com.example.datarest.projection;

import com.example.datarest.entity.Detail;
import com.example.datarest.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "customDetail", types = Detail.class)
public interface CustomDetail {

    public Product getProduct();

    public short getQuantity();
}
