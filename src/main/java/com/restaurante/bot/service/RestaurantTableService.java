package com.restaurante.bot.service;

import com.restaurante.bot.model.Customer;
import com.restaurante.bot.model.RestaurantTable;
import com.restaurante.bot.repository.RestaurantTableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantTableService {

    private RestaurantTableRepository restaurantTableRepository;

    public RestaurantTableService(RestaurantTableRepository restaurantTableRepository) {
        this.restaurantTableRepository = restaurantTableRepository;
    }

    public List<RestaurantTable> ListarMesas(){
        return restaurantTableRepository.findAll();
    }

    public RestaurantTable guardarMesa(RestaurantTable restaurantTable){
        return restaurantTableRepository.save(restaurantTable);
    }
}
