package com.stigentech.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stigentech.jpa.dao.Productrepository;
import com.stigentech.jpa.model.Product;

@Service
public class Productservice {
	
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
	

}
