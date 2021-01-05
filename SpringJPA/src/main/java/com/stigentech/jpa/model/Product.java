package com.stigentech.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
// 
@Entity
public class Product {
	@Id
	private int id;
	private String name;
	private double price;
	private String discription;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Product(int id, String name, double price, String discription) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discription = discription;
	}
	public Product() {
	
	}
	

}
