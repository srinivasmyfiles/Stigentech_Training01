package com.stigentech.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stigentech.jpa.dao.Productrepository;
import com.stigentech.jpa.model.Product;

@Service
public class Productservice implements Productintf {
	
	@Autowired
	public Productrepository rep;
	
	public Product Psave(Product p) {
		return rep.save(p);
	}
	

	
	
	
	public Product  pupdate(Product p) {
		return rep.save(p);
	}
	
	public void delete(int id) {
		rep.deleteById(id);

	}
	

	
	public List<Product> Pfindall() {
		return rep.findAll();
		
	}
	public Optional<Product> Pfindbyid(int id) {
		return rep.findById(id);
		
	}
	
 public List<Product> namelike(String name) {
	 return rep.findProductsByNameLike(name);
	
}


 public List<Product>  pricerange(double startRange,double endRange) {
	 return rep.findProductsByPriceBetween(startRange, endRange);
	
}
 public List<Product>  prodbyname(String name) {
	 return rep.findProductsByName(name);
	
}
 public List<Product>  prodbyprice(double price) {
	 return rep.findProductsByPrice(price);
	
}
 
 public List<Product>  prodbypriceandname(double price,String name) {
	 return rep.findProductsByPriceAndName(price, name);
	
}
 
}
