package com.restaurante.bot.controller;

import com.restaurante.bot.business.interfaces.RestaurantTableInterface;
import com.restaurante.bot.model.RestaurantTable;
import com.restaurante.bot.business.service.RestaurantTableService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restauranttable")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
public class RestaurantTableController {

    private final RestaurantTableInterface restaurantTableInterface;


    @GetMapping
    public List<RestaurantTable> ListarMesas() {
        return restaurantTableInterface.ListarMesas();
    }
/*
    @PostMapping
    public RestaurantTable guardarMesa (@RequestBody RestaurantTable restaurantTable) {
        return restaurantTableService.guardarMesa(restaurantTable);
    }


 */


    @PostMapping("/change/status")
    public ResponseEntity<String> changeStatus(@RequestParam Long tableNumber) {
        return new ResponseEntity<>(restaurantTableInterface.changeStatus(tableNumber), HttpStatus.OK);
    }
}
