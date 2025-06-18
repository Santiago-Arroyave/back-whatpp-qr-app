package com.restaurante.bot.business.service;

import com.restaurante.bot.model.Product;
import com.restaurante.bot.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> ListarProducto() {
        return productRepository.findAll();
    }
    public Product guardarProducto(Product product) {
        return productRepository.save(product);
    }
}
