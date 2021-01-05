package com.stigentech.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.stigentech.jdbc.model.Product;

@Repository
public class Productrepositoryimpl {
	
	@Autowired
	private JdbcTemplate jdbc;
	// crud operations
	
	//create
	public void save(Product pro) {
		
		String q1="insert into product(id,name,price,description) values(?,?,?,?)";
		jdbc.update(q1,pro.getId(),pro.getName(),pro.getPrice(),pro.getDiscription());
		System.out.println("product save to db");
	}
	//u-upadate
	public void update(Product pro) {
		String q1="update product set name=?,price=?,description=? where id=?";
		jdbc.update(q1,pro.getName(),pro.getPrice(),pro.getDiscription(),pro.getId());
		System.out.println("update product ");
		
	}
	

	
	//d -delete
	public void delete(int id) {
		String q1="delete from product where id=?";
		jdbc.update(q1,id);
		System.out.println("delete");
		
	}
	//r- read
	public List<Product> listall() {
		String q1="select * from product";
		return jdbc.query(q1, new RowMapper<Product>() {
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
				Product prod= new Product();
				prod.setId(rs.getInt("id"));
				prod.setName(rs.getString("name"));
				prod.setPrice(rs.getDouble("price"));
				prod.setDiscription(rs.getString("description"));
			 return prod;
	
	}});
		}
	
	//r-read
	public List<Product> listAll() {
		return jdbc.queryForObject("select * from product", new ListAllProducts());
	}
	
	class ListAllProducts implements RowMapper<List<Product>> {

		List<Product> prods = new ArrayList<>();
		@Override
		public List<Product> mapRow(ResultSet rs, int rowNum) throws SQLException {

			do {
				Product prod = new Product();
				prod.setId(rs.getInt("id"));
				prod.setName(rs.getString("name"));
				prod.setPrice(rs.getDouble("price"));
				prod.setDiscription(rs.getString("description"));

				prods.add(prod);

			} while (rs.next());
			return prods;
		}
	}
	

	

}
