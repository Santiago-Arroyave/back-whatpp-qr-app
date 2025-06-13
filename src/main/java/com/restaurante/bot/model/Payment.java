package com.restaurante.bot.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private  Integer payment_id;

    @Column(name = "order_id")
    private Integer order_id;

    @Column(name = "payment_method")
    private String payment_method;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id", insertable = false,updatable = false)
    private CustomerOrder customerOrder;

    public Payment() {}

    public Payment(Integer payment_id, Integer order_id, String payment_method, BigDecimal amount, String date) {
        this.payment_id = payment_id;
        this.order_id = order_id;
        this.payment_method = payment_method;
        this.amount = amount;
        this.date = date;
    }
    public Integer getPayment_id() {
        return payment_id;
    }
    public void setPayment_id(Integer payment_id) {
        this.payment_id = payment_id;
    }
    public Integer getOrder_id() {
        return order_id;
    }
    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }
    public String getPayment_method() {
        return payment_method;
    }
    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }
    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }
}
