package com.mycart.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="sub_category")
public class SubCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subCategoryId;
	@Column(length=15)
	private String name;
	
	@OneToMany(mappedBy = "subCategory", cascade = CascadeType.ALL)
	Set<Product> products = new HashSet<Product>();
	
	@ManyToOne
	@PrimaryKeyJoinColumn
	private Product_Category pcg;

	public SubCategory() {
		// TODO Auto-generated constructor stub
	}
	
	public void addProduct(Product product) {
		products.add(product);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product_Category getPcg() {
		return pcg;
	}

	public void setPcg(Product_Category pcg) {
		this.pcg = pcg;
	}

	public int getSubCategoryId() {
		return subCategoryId;
	}

	@Override
	public String toString() {
		return "SubCategory [subCategoryId=" + subCategoryId + ", name=" + name
				+ ", pcg=" + pcg + "]";
	}
}
