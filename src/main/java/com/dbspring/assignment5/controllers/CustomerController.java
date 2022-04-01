package com.dbspring.assignment5.controllers;


import com.dbspring.assignment5.model.Customer;
import com.dbspring.assignment5.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @GetMapping("/customers/{id}")
    public Customer getById(@RequestParam Integer id){
        return customerService.getById(id);
    }

    @PutMapping("/customers")
    public void createCustomer(@RequestBody Customer customer){
        customerService.insert(customer);
    }

    @PutMapping("/customers/update")
    public void updateCustomer(@RequestBody Customer customer){
        customerService.update(customer);
    }

    @DeleteMapping("/customers/delete/{id}")
    public void deleteById(@RequestParam Integer id){
        customerService.delete(customerService.getById(id));
    }
}
