package com.mycart.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product_category")
public class Product_Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int categoryId;

	@OneToMany(mappedBy = "product_Category", cascade = CascadeType.ALL, targetEntity =Product.class)
	private Set<Product> products = new HashSet<Product>();
	
	@Column(length=15)
	private String category_name;

	@OneToMany(mappedBy = "pcg", cascade = CascadeType.ALL, targetEntity =SubCategory.class)
	private Set<SubCategory> subCategorys = new HashSet<SubCategory>();

	public Product_Category(String category_name) {
		super();
		this.category_name = category_name;
	}
	public Product_Category() {
		// TODO Auto-generated constructor stub
	}
	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public Set<Product> getProduct() {
		return products;
	}

	public void setProduct(Set<Product> product) {
		this.products = product;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void addSubCategory(SubCategory subCategory) {
		subCategorys.add(subCategory);
	}

	public Set<SubCategory> getSubCategory() {
		return subCategorys;
	}

	public void setSubCategory(Set<SubCategory> subCategorys) {
		this.subCategorys = subCategorys;
	}

	@Override
	public String toString() {
		return "Product_Category [categoryId=" + categoryId
				+ ", category_name=" + category_name + "]";
	}

}
