package com.curso.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.curso.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
