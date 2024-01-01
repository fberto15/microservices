package com.curso.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.curso.productservice.dto.ProductRequestDto;
import com.curso.productservice.dto.ProductResponseDto;
import com.curso.productservice.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createProduct(@RequestBody ProductRequestDto request) {
		productService.createProduct(request);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ProductResponseDto> getAllProducts() {
		return productService.getAllProducts();
	}

}
