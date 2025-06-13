package com.restaurante.bot.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "waitercall")
public class WaiterCall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "call_id")
    private Integer callId;

    @Column(name = "table_id", nullable = false)
    private Integer tableId;

    @Column(name = "status")
    private String status;

    @Column(name = "time" , nullable = false)
    private LocalDateTime time;

    @ManyToOne
    @JoinColumn(name = "table_id", referencedColumnName = "table_id",insertable = false,updatable = false )
    private RestaurantTable restaurantTable;

    public WaiterCall() {}
    public WaiterCall(Integer callId,Integer tableId, String status, LocalDateTime time, RestaurantTable restaurantTable) {
        this.callId = callId;
        this.tableId = tableId;
        this.status = status;
        this.time = time;
    }
    public Integer getCallId() {
        return callId;
    }
    public void setCallId(Integer callId) {
        this.callId = callId;
    }
    public Integer getTableId() {
        return tableId;
    }
    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDateTime getTime() {
        return time;
    }
    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    public RestaurantTable getRestaurantTable() {
        return restaurantTable;
    }
    public void setRestaurantTable(RestaurantTable restaurantTable) {
        this.restaurantTable = restaurantTable;
    }

}
