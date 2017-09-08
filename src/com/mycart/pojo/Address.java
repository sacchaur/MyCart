package com.mycart.pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(length=30)
	private String area;
	@Column(length=30)
	private String street;
	@Column(length=20)
	private String city;
	@Column(length=15)
	private String state;
	@Column(length=7)
	private String pin_code;

	public Address(){
		
	}
	public Address(String area, String street, String city, String state,
			String pin_code) {
		super();
		this.area = area;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin_code = pin_code;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin_code() {
		return pin_code;
	}

	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", street=" + street + ", city="
				+ city + ", state=" + state + ", pin_code=" + pin_code + "]";
	}

}
