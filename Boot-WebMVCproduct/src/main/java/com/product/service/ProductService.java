package com.product.service;

import java.util.List;

import com.product.entity.Product;

public interface ProductService {
	long count();

	void saveProduct(Product prod);

	List<Product> findAll();

	List<Product> findByName(String name);

	List<Product> findProductByPriceBetween(double startRange,double endRange);
	
	List<Product> findAllProductsAboveGivenId(int id);

	Product findById(int id);

	Product update(Product prod);

	void delete(int id);
}
