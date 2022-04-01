package com.dbspring.assignment5.services;

import com.dbspring.assignment5.model.Customer;
import com.dbspring.assignment5.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer getById(Integer id){
        return customerRepository.getById(id);
    }

    public List<Customer> getAll(){
        List<Customer> aux = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public void insert(Customer customer){
        customerRepository.save(customer);
    }

    public void update(Customer customer){
        customerRepository.save(customer);
    }

    public void delete(Customer customer){
        customerRepository.delete(customer);
    }
}
