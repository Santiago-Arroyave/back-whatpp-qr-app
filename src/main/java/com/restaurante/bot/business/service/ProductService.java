package com.restaurante.bot.business.service;

import com.restaurante.bot.api.dto.ProductDTO;
import com.restaurante.bot.business.call.CallServiceHttp;
import com.restaurante.bot.business.interfaces.ProductInterface;
import com.restaurante.bot.dto.ProductResponseDTO;
import com.restaurante.bot.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ProductService implements ProductInterface {

    private final ProductRepository productRepository;
    private final CallServiceHttp callServiceHttp;

    @Override
    public List<ProductResponseDTO> getProductsSfotRestaurantByCompanyId(Long companyId) {

        log.info("Se inicia el llamado a la api que tare los " +
                "productos de soft restaurant para la compañia con id -> {}", companyId);

        List<ProductDTO> products = callServiceHttp.getProduct(companyId);

        List<ProductResponseDTO> productResponseDTOs = products.stream().map(product -> new ProductResponseDTO(
                        product.getId(),
                        product.getIdProducto(),
                        product.getData().getDescripcion(),
                        product.getData().getPrecio(),
                        product.getData().getGrupo() != null ? product.getData().getGrupo().getIdGrupo() : "",
                        product.getData().getGrupo() != null ? product.getData().getGrupo().getDescripcion() : ""

                ))
                .collect(Collectors.toList());
        return productResponseDTOs;
    }
}
