package com.mycart.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class Order_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int detailId;
	
	@OneToOne
	@JoinColumn
	private Order order;
	
	private int quantity;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Purchase_Details purchase_Details;
	private int sub_total;
	
	@Column(length=15)
	private String orderDate;
	
	public Order_Details() {
		// TODO Auto-generated constructor stub
	}
	public Order_Details(Order order, int quantity, int sub_total,
			String orderDate, Purchase_Details purchase_Details) {
		super();
		this.order = order;
		this.quantity = quantity;
		this.sub_total = sub_total;
		this.orderDate = orderDate;
		this.purchase_Details = purchase_Details;
	}

	
	public Purchase_Details getPurchase_Details() {
		return purchase_Details;
	}

	public void setPurchase_Details(Purchase_Details purchase_Details) {
		this.purchase_Details = purchase_Details;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSub_total() {
		return sub_total;
	}

	public void setSub_total(int sub_total) {
		this.sub_total = sub_total;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order_Details [quantity=" + quantity + ", sub_total="
				+ sub_total + ", orderDate=" + orderDate + "]";
	}

}
