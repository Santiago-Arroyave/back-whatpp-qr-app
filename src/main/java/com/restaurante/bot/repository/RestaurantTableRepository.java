package com.restaurante.bot.repository;

import com.restaurante.bot.model.Customer;
import com.restaurante.bot.model.RestaurantTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantTableRepository extends JpaRepository<RestaurantTable, Long> {
}
