package com.restaurante.bot.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Order;

import java.math.BigDecimal;

@Entity
@Table(name = "order_product")
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_product_id")
    private Integer orderProductId;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "subtotal")
    private BigDecimal subtotal;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id", insertable = false, updatable = false)
    private CustomerOrder customerOrder;


    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)
    private Product product;

    public OrderProduct() {}

    public OrderProduct(Integer orderProductId, Integer orderId, Integer productId, Integer quantity, BigDecimal subtotal) {
        this.orderProductId = orderProductId;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.subtotal = subtotal;

    }

    public Integer getOrderProductId() {
        return orderProductId;
    }
    public void setOrderProductId(Integer orderProductId) {
        this.orderProductId = orderProductId;
    }
    public Integer getOrderId() {
        return orderId;
    }
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public Integer getProductId() {
        return productId;
    }
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public BigDecimal getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }
    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
}
