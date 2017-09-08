package com.mycart.dao;

import java.util.List;

import com.mycart.pojo.Customer;
import com.mycart.pojo.Product;

public interface DaoInterface {
	public List<Product> getAllProduct();
	public Product getProductById(int productId);
	public List<Product> getProductBySubCategory(String productCategory);
	List<Product> getProductByName(String productName);
	public void addCustomer(Customer customer);
	public Customer getCustomerByEmail(String email);
	List<Product> getAllProductByName(String productName);
	public void addProduct(Product product);
	void updateProduct(Product product);

}
