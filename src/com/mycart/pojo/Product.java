package com.mycart.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	@Column(length = 15)
	private String productName;
	private double price;
	private float discount;
	@Column(length = 80)
	private String description;
	@Column(length = 30)
	private String imagePath;
	private long totalCount;
	
	@ManyToOne
	@PrimaryKeyJoinColumn
	private Product_Category product_Category;

	@ManyToOne
	@PrimaryKeyJoinColumn
	private SubCategory subCategory;

	@ManyToOne
	@PrimaryKeyJoinColumn
	private SubCategory purches_details;
	
	public Product() {
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public Product(String productName, double price, float discount, String description, String imagePath, long totalCount) {
		super();

		this.productName = productName;
		this.price = price;
		this.discount = discount;
		this.description = description;
		this.imagePath = imagePath;
		this.totalCount = totalCount;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product_Category getProduct_Category() {
		return product_Category;
	}

	public void setProduct_Category(Product_Category product_Category) {
		this.product_Category = product_Category;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", discount="
				+ discount + ", description=" + description + "]";
	}

	
}
