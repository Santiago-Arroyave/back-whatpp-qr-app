package com.restaurante.bot.business.interfaces;

import com.restaurante.bot.dto.ProductResponseDTO;

import java.util.List;

public interface ProductInterface {

    List<ProductResponseDTO> getProductsSfotRestaurantByCompanyId(Long companyId);
}
