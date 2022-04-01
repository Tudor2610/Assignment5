package com.dbspring.assignment5.repositories;

import com.dbspring.assignment5.model.CustomerOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, Integer> {
    public CustomerOrder getById(Integer id);
    public List<CustomerOrder> getAllByCustomer_Id(Integer id);
}
