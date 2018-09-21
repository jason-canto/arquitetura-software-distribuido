package com.jason.ecommerce.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Basic(optional = false)
	private String name;

	private Double price;

	private String pictureUrl;

	public Product(Long id, @NotNull String name, Double price,
			String pictureUrl) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.pictureUrl = pictureUrl;
	}

}
