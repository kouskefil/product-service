package com.kouskefil.microservices.product.DTO;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public record ProductRequest( String id, String name, String description, BigDecimal price) { }

