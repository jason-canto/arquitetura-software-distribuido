package com.jason.ecommerce.dto;

import com.jason.ecommerce.model.Product;

import lombok.Data;

@Data
public class OrderProductDto {

	private Product product;
	private Integer quantity;

}
