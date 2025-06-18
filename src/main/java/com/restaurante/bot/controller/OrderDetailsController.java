package com.restaurante.bot.controller;

import com.restaurante.bot.dto.OrderDetailsDTO;
import com.restaurante.bot.business.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class OrderDetailsController {

    private final OrderDetailsService orderDetailsService;

    @Autowired
    public OrderDetailsController(OrderDetailsService orderDetailsService) {
        this.orderDetailsService = orderDetailsService;
    }

    @GetMapping("/orders/{orderId}")
    public List<OrderDetailsDTO> getOrderDetails(@PathVariable Long orderId) {
        return orderDetailsService.getOrderDetails(orderId);
    }
}
