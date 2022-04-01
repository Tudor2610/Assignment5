package com.dbspring.assignment5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OrderDetails {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer order_id;
    private String product_code;
    private Integer quantity;
    private Double priceEach;
    @OneToOne
    private CustomerOrder customerOrder;

    public OrderDetails(Integer id, Integer order_id, String product_code, Integer quantity, Double priceEach, CustomerOrder customerOrder) {
        this.id = id;
        this.order_id = order_id;
        this.product_code = product_code;
        this.quantity = quantity;
        this.priceEach = priceEach;
        this.customerOrder = customerOrder;
    }

    public OrderDetails() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(Double priceEach) {
        this.priceEach = priceEach;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }
}
