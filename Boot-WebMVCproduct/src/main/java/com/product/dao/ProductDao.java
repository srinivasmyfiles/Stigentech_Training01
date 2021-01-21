package com.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
	List<Product> findProductByNameLike(String name);
	
	// 1. find  -> verb
	// 2. Product -> Entity class name
	// 3. by -> adjective
	// 4. Name -> property in Entity class (First letter should be uppercase)
	// 5. keyword 
	
	// display all products price ranges between 500 and 2000
	
	List<Product> findProductByPriceBetween(double startRange,double endRange);
	
	
	// @Query in Data JPA
	
	// Find all products where productId above 5
	
	@Query(value = "from Product p where p.id >=:id")
	List<Product> findAllProductsAboveGivenId(int id);
	
	
	
	
	
	
	
	

}
