package com.stigentech.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stigentech.jpa.model.Product;
import com.stigentech.jpa.service.Productservice;

@RestController
public class controller {
	@Autowired
	public Productservice ser;
	@PostMapping("/save")
	public void name(@RequestBody  Product  product) {
		ser.Psave(product);
	}
	
	@GetMapping("findall")
	public List<Product> findall() {
		return ser.Pfindall();
	}
	
	@GetMapping("findbyid/{id}")
	public Optional<Product> findbyid(@PathVariable("id") int id) {
		return ser.Pfindbyid(id);
	}
	
	@DeleteMapping("deletebyid/{id}")
	public void delete(@PathVariable("id") int id) {
		ser.delete(id);
	}
	
	@PutMapping("update")
	public void update(@RequestBody Product pro) {
		ser.Psave(pro);
	}
	
	@PutMapping("/esave")
	public ResponseEntity<String> name1(@RequestBody  Product  product) {
		ser.Psave(product);
		return new ResponseEntity<String>("update", HttpStatus.ACCEPTED);
	
	}
}
