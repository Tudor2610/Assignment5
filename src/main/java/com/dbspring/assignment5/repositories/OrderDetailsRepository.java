package com.dbspring.assignment5.repositories;

import com.dbspring.assignment5.model.OrderDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer> {
    public OrderDetails getByCustomerOrder_Id(Integer id);

}
