package com.mycart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycart.dao.DaoInterface;
import com.mycart.pojo.Customer;
import com.mycart.pojo.Product;
@Service
public class ServiceImpl implements ServiceInterface{

	DaoInterface daoInterface;
	
	@Autowired
	public void setDaoInterface(DaoInterface daoInterface) {
		this.daoInterface = daoInterface;
	}

	public List<Product> getAllProduct(){
		return daoInterface.getAllProduct();
	
		
	}

	@Override
	public Product getProductById(int productId) {
		
		return daoInterface.getProductById(productId);
	}

	@Override
	public List<Product> getProductBySubCategory(String productCategory) {
	
		return daoInterface.getProductBySubCategory(productCategory);
	}

	@Override
	public List<Product> getProductByName(String productName) {
		
		return daoInterface.getProductByName(productName);
	}

	@Override
	public void addCustomer(Customer customer) {
		daoInterface.addCustomer(customer);
		
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		
		return daoInterface.getCustomerByEmail(email);
	}

	@Override
	public List<Product> getAllProductByName(String productName) {
		return daoInterface.getAllProductByName(productName);
	}

	@Override
	public void addProduct(Product product) {
		daoInterface.addProduct(product);
	}

	@Override
	public void updateProduct(Product product) {
		daoInterface.updateProduct(product);
		
	}

	
}
