package com.mycart.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	@Column(length = 15)
	private String customerName;
	@Column(length = 25)
	private String email;
	@Column(length = 15)
	private String password;

	@Embedded
	private Address address;
	private long phoneNo;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, targetEntity = Order.class)
	private Set<Order> orders = new HashSet<Order>();

	public Customer() {

	}

	public Customer(String customerName, String email, String password, Address address, long phoneNo) {
		super();
		this.customerName = customerName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void addOredr(Order order) {
		orders.add(order);

	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
				+ ", address=" + address + ", phoneNo=" + phoneNo + "]";
	}

}
