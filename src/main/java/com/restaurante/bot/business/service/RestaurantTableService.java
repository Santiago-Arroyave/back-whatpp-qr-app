package com.restaurante.bot.business.service;

import com.restaurante.bot.business.interfaces.RestaurantTableInterface;
import com.restaurante.bot.model.Customer;
import com.restaurante.bot.model.RestaurantTable;
import com.restaurante.bot.repository.RestaurantTableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class RestaurantTableService implements RestaurantTableInterface {

    private final RestaurantTableRepository restaurantTableRepository;

    @Override
    public List<RestaurantTable> ListarMesas(){
        return restaurantTableRepository.findAll();
    }

    public RestaurantTable guardarMesa(RestaurantTable restaurantTable){
        return restaurantTableRepository.save(restaurantTable);
    }

    @Override
    public String changeStatus(Long tableNumber) {

        if (!restaurantTableRepository.existsById(tableNumber)) {
            return "No existe la tabla";
        }

        RestaurantTable table = restaurantTableRepository.findByTableNumber(tableNumber);

        table.setStatus(table.getStatus() == 1L ? 2L : 1L);

        restaurantTableRepository.save(table);

        return "Estado Modificado";
    }
}
