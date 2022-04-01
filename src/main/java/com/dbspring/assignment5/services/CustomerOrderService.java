package com.dbspring.assignment5.services;


import com.dbspring.assignment5.model.CustomerOrder;
import com.dbspring.assignment5.repositories.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerOrderService {

    @Autowired
    CustomerOrderRepository customerOrderRepository;

    public CustomerOrder getById(Integer id){
        return customerOrderRepository.getById(id);
    }

    public List<CustomerOrder> getAll(){
        List<CustomerOrder> aux = new ArrayList<>();
        customerOrderRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public List<CustomerOrder> getAllByCustomerId(Integer id){
        return customerOrderRepository.getAllByCustomer_Id(id);
    }

    public void insert(CustomerOrder customerOrder){
        customerOrderRepository.save(customerOrder);
    }

    public void update(CustomerOrder customerOrder){
        customerOrderRepository.save(customerOrder);
    }

    public void delete(CustomerOrder customerOrder){
        customerOrderRepository.delete(customerOrder);
    }


}
