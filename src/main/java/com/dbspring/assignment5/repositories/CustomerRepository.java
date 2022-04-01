package com.dbspring.assignment5.repositories;

import com.dbspring.assignment5.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    public Customer getById(Integer id);
}
