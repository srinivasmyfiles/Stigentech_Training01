package com.stigentech.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.stigentech.jpa.model.Product;
import com.stigentech.jpa.service.Productservice;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
	ApplicationContext ac	=SpringApplication.run(SpringJpaApplication.class, args);
		
		
	Productservice dao = ac.getBean(Productservice.class);
	//   //save
		
	Product prod =new Product();
//		prod.setId(21);
//		prod.setName("hp laptop");
//		prod.setPrice(22222);
//		prod.setDiscription("good ");
//		dao.Psave(prod);
	//	
	//	
	//	
//		update
	//	prod.setId(22);
		prod.setName("dell+ laptop");
		prod.setPrice(9999);
		prod.setDiscription("vvvgood");
		dao.Psave(prod);

//	//   //read	
     Optional<Product> prod1= dao.Pfindbyid(2);
//	    
//	       Product product=prod1.get();
//	        System.out.println(product.getId());
//	     	System.out.println(product.getName());
//			System.out.println(product.getPrice());		
//			System.out.println(product.getDiscription());
//			System.out.println("------------------------------------");
////	
	
	////delete
		
//		dao.delete(21);
     
     //FIND BY NAME AND PRICE
    // List<Product> prods=dao.pricerange(5000, 1000000);
	//  List<Product> prods=dao.namelike("%h%");
     List<Product> prods=dao.prodbypriceandname(22222,"hp laptop");
		for (Product product : prods) {
			System.out.println(product.getId());
	     	System.out.println(product.getName());
			System.out.println(product.getPrice());		
			System.out.println(product.getDiscription());
			System.out.println("------------------------------------");
		}
		
	}
}


