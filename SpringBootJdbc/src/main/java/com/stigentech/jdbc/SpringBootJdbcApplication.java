package com.stigentech.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.stigentech.jdbc.dao.Productrepositoryimpl;
import com.stigentech.jdbc.model.Product;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
	ApplicationContext ac	=SpringApplication.run(SpringBootJdbcApplication.class, args);
	Productrepositoryimpl dao = ac.getBean(Productrepositoryimpl.class);
//   //save
	
	Product prod =new Product();
//	prod.setId(21);
//	prod.setName("hp laptop");
//	prod.setPrice(22222);
//	prod.setDiscription("good ");
//	dao.save(prod);
//	
//	
//	
//	//update
//	prod.setId(21);
//	prod.setName("dell laptop");
//	prod.setPrice(44444);
//	prod.setDiscription("vgood");
//	dao.update(prod);

//   //read	
	for(Product product:dao.listAll()) {
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getDiscription());
		System.out.println("------------------------------------");
	}
	
////delete
	
//	dao.delete(22);
	
	}
	
	
	
	
}
