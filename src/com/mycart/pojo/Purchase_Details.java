package com.mycart.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_details")
public class Purchase_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int PurchaseId;

	@OneToOne(mappedBy = "purchase_Details", cascade = CascadeType.ALL)
	private Order_Details order_Detail;

	@OneToMany
	@JoinColumn
	private Set<Product> products = new HashSet<Product>();

	public Purchase_Details() {

	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public Order_Details getOrder_Detail() {
		return order_Detail;
	}

	public void setOrder_Detail(Order_Details order_Detail) {
		this.order_Detail = order_Detail;
	}

	public Set<Product> getProduct() {
		return products;
	}

	public void setProduct(Set<Product> product) {
		this.products = product;
	}

	@Override
	public String toString() {
		return "Purchase_Details [order=" + order_Detail + ", product=" + products + "]";
	}

}