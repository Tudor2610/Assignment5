package com.dbspring.assignment5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue
    private Integer id;
    private Date order_date;
    private Date shipped_date;
    private String status;
    private String comments;
//    @ManyToOne
//    private Integer customer_id;
    @ManyToOne
    private Customer customer;

    public CustomerOrder(Integer id, Date order_date, Date shipped_date, String status, String comments ) {
        this.id = id;
        this.order_date = order_date;
        this.shipped_date = shipped_date;
        this.status = status;
        this.comments = comments;
//        this.customer_id = customer_id;
    }

    public CustomerOrder() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Date getShipped_date() {
        return shipped_date;
    }

    public void setShipped_date(Date shipped_date) {
        this.shipped_date = shipped_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

//    public Integer getCustomer_id() {
//        return customer_id;
//    }
//
//    public void setCustomer_id(Integer customer_id) {
//        this.customer_id = customer_id;
//    }
}
