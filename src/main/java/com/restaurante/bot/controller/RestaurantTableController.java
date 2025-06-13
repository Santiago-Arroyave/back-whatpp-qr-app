package com.restaurante.bot.controller;

import com.restaurante.bot.model.RestaurantTable;
import com.restaurante.bot.service.RestaurantTableService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restauranttable")
public class RestaurantTableController {

    private final RestaurantTableService restaurantTableService;

    public RestaurantTableController(RestaurantTableService restaurantTableService) {
        this.restaurantTableService = restaurantTableService;
    }

    @GetMapping
    public List<RestaurantTable> ListarMesas() {
        return restaurantTableService.ListarMesas();
    }

    @PostMapping
    public RestaurantTable guardarMesa (@RequestBody RestaurantTable restaurantTable) {
        return restaurantTableService.guardarMesa(restaurantTable);
    }
}
