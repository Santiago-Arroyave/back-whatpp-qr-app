package com.restaurante.bot.controller;

import com.restaurante.bot.model.Product;
import com.restaurante.bot.business.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> ListarProducto() {
        return productService.ListarProducto();
    }

    @PostMapping
    public Product guaerdarProducto(@RequestBody Product product) {
        return productService.guardarProducto(product);
    }
}
