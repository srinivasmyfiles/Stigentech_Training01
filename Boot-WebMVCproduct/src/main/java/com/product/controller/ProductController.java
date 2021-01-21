package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.entity.Product;
import com.product.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService ps;

	@RequestMapping("/")
	public String welcome() {
		return "index";
	}

	// load product form

	@RequestMapping("/loadProductForm")
	public String loadProductForm() {
		return "productform";
	}

	// save Product into DB
	@RequestMapping("/saveProduct")
	public String saveProduct(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("price") double price, @RequestParam("description") String description) {

		Product prod = new Product();
		prod.setId(id);
		prod.setName(name);
		prod.setPrice(price);
		prod.setDescription(description);

		ps.saveProduct(prod);
		return "productform";
	}

	@RequestMapping("/saveProductV2")
	public String saveProductV2(@ModelAttribute Product prod,Model data) {

		ps.saveProduct(prod);
		data.addAttribute("msg", "Product "+prod.getName()+ "saved to Database");
		
		return "productform";
	}
	
	// list all products to a jsp page
	
	@RequestMapping("/listAll")
	public String listAll(Model data) {
		
		List<Product> prods=ps.findAll();
		data.addAttribute("products", prods);
		return "products";
		
	}
	
	
	
	
	
	
	
	
	
	

}
