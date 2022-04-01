package com.dbspring.assignment5.controllers;


import com.dbspring.assignment5.services.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderDetailsController {

    @Autowired
    OrderDetailsService orderDetailsService;

    @GetMapping("/orderdetails/{id}")
    public Map<String, Integer> getOrderProductsById(@RequestParam Integer id){
        return orderDetailsService.getOrderProducts(id);
    }
}
