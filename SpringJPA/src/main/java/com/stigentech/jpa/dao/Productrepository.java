package com.stigentech.jpa.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stigentech.jpa.model.Product;
@Repository
public interface Productrepository extends JpaRepository<Product,Serializable> {

}
