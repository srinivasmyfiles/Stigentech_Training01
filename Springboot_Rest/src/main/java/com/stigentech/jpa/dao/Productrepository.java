package com.stigentech.jpa.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stigentech.jpa.model.Product;
@Repository
public interface Productrepository extends JpaRepository<Product,Serializable> {
	
	//by name
  List<Product> findProductsByNameLike(String name);
  List<Product> findProductsByPriceBetween(double startRange,double endRange);
  //jpql
   @Query("select p from Product p where p.name=:name")
 List<Product> findProductsByName(@Param("name")String name);
  
   @Query("select p from Product p where p.price=:price")
 List<Product> findProductsByPrice(@Param("price")double price); 
   
   @Query("select p from Product p where p.price=:price AND p.name=:name")
   List<Product> findProductsByPriceAndName(@Param("price")double price,@Param("name")String name); 
   
   //native quary
   @Query(value="select* from product",nativeQuery = true)
   List<Product> findallproduct();
}
