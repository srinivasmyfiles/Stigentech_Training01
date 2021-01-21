package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDao;
import com.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	public long count() {

		// TODO Auto-generated method stub
		return prodDao.count();
	}

	@Override
	public void saveProduct(Product prod) {
		// TODO Auto-generated method stub
		prodDao.save(prod);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return prodDao.findAll();
	}

	@Override
	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		return prodDao.findProductByNameLike(name);
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return prodDao.findById(id).orElse(null);
	}

	@Override
	public Product update(Product prod) {
		// TODO Auto-generated method stub
		return prodDao.save(prod);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

		prodDao.deleteById(id);

	}
	
	
@Override
	public List<Product> findAllProductsAboveGivenId(int id) {
		// TODO Auto-generated method stub
		return prodDao.findAllProductsAboveGivenId(id);
	}

	@Override
	public List<Product> findProductByPriceBetween(double startRange,double endRange) {
		// TODO Auto-generated method stub
		return prodDao.findProductByPriceBetween(startRange, endRange);
	}
	
	

}
