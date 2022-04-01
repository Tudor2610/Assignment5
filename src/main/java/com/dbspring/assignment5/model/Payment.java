package com.dbspring.assignment5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Payment {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer customer_id;
    private Date payment_date;
    private Double amount;

    public Payment(Integer id, Integer customer_id, Date payment_date, Double amount) {
        this.id = id;
        this.customer_id = customer_id;
        this.payment_date = payment_date;
        this.amount = amount;
    }

    public Payment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
