package com.stigentech.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import org.hibernate.type.SerializableType;

import lombok.Data;
import lombok.NoArgsConstructor;
// 
@Entity

@SequenceGenerator(name = "genname",initialValue = 4500,allocationSize = 1)
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2165994709950500350L;

	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "genname")
	private int id;
   
	private String name;

	private double price;
	//@Transient
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
