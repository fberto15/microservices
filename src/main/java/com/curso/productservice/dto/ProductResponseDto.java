package com.curso.productservice.dto;

import java.math.BigDecimal;

public class ProductResponseDto {

	private String id;
	private String name;
	private String description;
	private BigDecimal price;

	public static ProductResponseDto of(String id, String name, String description, BigDecimal price) {
		ProductResponseDto dto = new ProductResponseDto();
		dto.setId(id);
		dto.setName(name);
		dto.setDescription(description);
		dto.setPrice(price);
		return dto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
