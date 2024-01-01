package com.curso.productservice.service;

import java.util.List;

import com.curso.productservice.dto.ProductRequestDto;
import com.curso.productservice.dto.ProductResponseDto;

public interface ProductService {

	public void createProduct(ProductRequestDto request);

	public List<ProductResponseDto> getAllProducts();
}
