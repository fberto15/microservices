package com.curso.productservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.productservice.dto.ProductRequestDto;
import com.curso.productservice.dto.ProductResponseDto;
import com.curso.productservice.model.Product;
import com.curso.productservice.repository.ProductRepository;
import com.curso.productservice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void createProduct(ProductRequestDto request) {

		Product product = new Product(request.getName(), request.getDescription(), request.getPrice());

		productRepository.save(product);

	}

	@Override
	public List<ProductResponseDto> getAllProducts() {

		List<Product> products = productRepository.findAll();
		return products.stream().map(product -> mapToProductResponse(product)).toList();
	}

	private ProductResponseDto mapToProductResponse(Product product) {
		return ProductResponseDto.of(product.getId(), product.getName(), product.getDescription(), product.getPrice());
	}

}
