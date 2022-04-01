package com.dbspring.assignment5.services;

import com.dbspring.assignment5.model.OrderDetails;
import com.dbspring.assignment5.repositories.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderDetailsService {

    @Autowired
    OrderDetailsRepository orderDetailsRepository;

    public Map<String, Integer> getOrderProducts(Integer id){
        OrderDetails details = orderDetailsRepository.getByCustomerOrder_Id(id);
        Map<String, Integer> products = new HashMap<>();
        products.put(details.getProduct_code(), details.getQuantity());
        return products;
    }
}
