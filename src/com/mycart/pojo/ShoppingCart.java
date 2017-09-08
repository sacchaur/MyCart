package com.mycart.pojo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ShoppingCart {
	
public ShoppingCart() {
		
	}
	

	static Set<Product> products=new HashSet<Product>();
	
	public void addProductToCart(Product product){
		products.add(product);
	}
	

	
	public int getTotalItems() {
		
		return products.size();
	}
	
	public Set<Product> getAllProductInCart(){
		return products;
		
	}
	public double getTotalPrice() {
		double price=0;
		Iterator<Product> itr = products.iterator();
		while (itr.hasNext()) {
			Product product = itr.next();
			price=price+product.getPrice();
			
			}
		
		return price;
	}
	
	public void removeAll(){
		products.clear();
	}

}