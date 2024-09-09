package com.kouskefil.microservices.product.Repositories;

import com.kouskefil.microservices.product.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
