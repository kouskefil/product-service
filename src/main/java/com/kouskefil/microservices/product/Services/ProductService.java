package com.kouskefil.microservices.product.Services;

import Model.Product;
import com.kouskefil.microservices.product.Repositories.ProductRepository;
import com.kouskefil.microservices.product.DTO.ProductRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    @PostMapping
    public Product createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();
         productRepository.save(product);
         log.info("Product {} is saved", product.getId());
        return product;
    }


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
