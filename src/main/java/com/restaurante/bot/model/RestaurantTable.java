package com.restaurante.bot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "restauranttable")
public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "table_id")
    private Integer tableId;

    @Column(name = "table_number", nullable = false)
    private Integer tableNumber;

    @Column(name = "status")
    private String status;

    @Column(name = "customer_id")
    private Integer customerId;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id", insertable = false, updatable = false)
    private Customer customer;

    public RestaurantTable() {}

    // Constructor con parámetros
    public RestaurantTable(Integer tableId, Integer tableNumber, String status, Integer customerId) {
        this.tableId = tableId;
        this.tableNumber = tableNumber;
        this.status = status;
        this.customerId = customerId;
    }

    // Getters y Setters

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
