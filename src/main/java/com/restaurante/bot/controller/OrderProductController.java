package com.restaurante.bot.controller;

import com.restaurante.bot.model.OrderProduct;
import com.restaurante.bot.service.OrderProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order_product")
public class OrderProductController {

    private final OrderProductService orderProductService;

    public OrderProductController(OrderProductService orderProductService) {
        this.orderProductService = orderProductService;
    }

    @GetMapping
    public List<OrderProduct> listarOrderProducts() {
        return orderProductService.ListarOrderProduct();
    }

    @PostMapping
    public OrderProduct guardarOrderProduct(@RequestBody OrderProduct orderProduct) {
        return orderProductService.guardarOrderProduct(orderProduct);
    }
}
