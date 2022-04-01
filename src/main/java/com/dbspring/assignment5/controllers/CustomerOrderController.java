package com.dbspring.assignment5.controllers;

import com.dbspring.assignment5.model.CustomerOrder;
import com.dbspring.assignment5.services.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerOrderController {

    @Autowired
    CustomerOrderService customerOrderService;

    @GetMapping("/customerorder/order/{id}")
    public CustomerOrder getById(@RequestParam Integer id){
        return customerOrderService.getById(id);
    }

    @GetMapping("/customerorder")
    public List<CustomerOrder> getAll(){
        return customerOrderService.getAll();
    }

    @GetMapping("/customerorder/{id}")
    public List<CustomerOrder> getAllByCustomerId(@RequestParam Integer id){
        return customerOrderService.getAllByCustomerId(id);
    }

    @PutMapping("/customerorder")
    public void createOrder(@RequestBody CustomerOrder customerOrder){
        customerOrderService.insert(customerOrder);
    }

    @PutMapping("/customerorder/update")
    public void updateOrder(@RequestBody CustomerOrder customerOrder){
        customerOrderService.update(customerOrder);
    }

    @DeleteMapping("/customerorder/delete")
    public void deleteOrder(CustomerOrder customerOrder){
        customerOrderService.delete(customerOrder);
    }
}
