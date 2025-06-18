package com.restaurante.bot.business.interfaces;

import com.restaurante.bot.model.RestaurantTable;

import java.util.List;

public interface RestaurantTableInterface {

    String changeStatus(Long tableNumber);

    List<RestaurantTable> ListarMesas();

}
