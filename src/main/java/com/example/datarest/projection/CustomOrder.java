package com.example.datarest.projection;

import com.example.datarest.entity.Customer;
import com.example.datarest.entity.Detail;
import com.example.datarest.entity.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;
import java.util.List;

@Projection(types = {Order.class}, name = "customOrder")
public interface CustomOrder {

//    @Value("#{target.customer}")
//    public Customer getCustomer();

    @Value("#{target.customer.name}")
    public String getCustomerName();

    @Value("#{target.detailList}")
    public List<CustomDetail> getDetailList();

    public LocalDate getDate();

}
