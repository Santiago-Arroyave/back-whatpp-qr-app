package com.restaurante.bot.dto;

import java.math.BigDecimal;

public class OrderDetailsDTO {
    private Long orderId;
    private String productName;
    private Integer quantity;
    private Integer tableNumber;
    private BigDecimal totalOrderPrice;
    private BigDecimal unitPrice;
    private String tableStatus;
    private String orderStatus;

    // Constructor
    public OrderDetailsDTO(Long orderId, String productName, Integer quantity, Integer tableNumber, BigDecimal totalOrderPrice, BigDecimal unitPrice, String tableStatus, String orderStatus) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.tableNumber = tableNumber;
        this.totalOrderPrice = totalOrderPrice;
        this.unitPrice = unitPrice;
        this.tableStatus = tableStatus;
        this.orderStatus = orderStatus;
    }

    // Getters and setters
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public BigDecimal getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public void setTotalOrderPrice(BigDecimal totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
