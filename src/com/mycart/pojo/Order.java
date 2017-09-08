package com.mycart.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="Ordercg")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	
	@ManyToOne
	@PrimaryKeyJoinColumn
	Customer customer;
	
	private boolean deliveryStatus;
	private boolean paymentStatus;
	
	@OneToOne(mappedBy="order",cascade=CascadeType.ALL, targetEntity = Order_Details.class)
	private Order_Details order_Details;
	
	public int getOrderId() {
		return orderId;
	}

	
	public Order(){
		
	}

	public Order(Customer customer, boolean deliveryStatus, boolean paymentStatus) {
		super();
		this.customer = customer;
		this.deliveryStatus = deliveryStatus;
		this.paymentStatus = paymentStatus;
	}




	




	public boolean isDeliveryStatus() {
		return deliveryStatus;
	}




	public void setDeliveryStatus(boolean deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}




	public boolean isPaymentStatus() {
		return paymentStatus;
	}




	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}




	public Customer getCustomer() {
		return customer;
	}


	public Order_Details getOrder_Details() {
		return order_Details;
	}


	public void setOrder_Details(Order_Details order_Details) {
		this.order_Details = order_Details;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", deliveryStatus=" + deliveryStatus
				+ ", paymentStatus=" + paymentStatus + ", odDetails=" + order_Details + "]";
	}

}
