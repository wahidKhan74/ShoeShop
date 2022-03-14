package com.project.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "product_tbl")
@EnableTransactionManagement
public class ProductModel {
	
	@Id
	@Column(name = "shoeID")
	private int shoe_ID;
	
	@Column(name = "shoeBrand")
	private String shoe_Brand;
	
	@Column(name = "shoeName")
	private String shoe_Name;
	
	@Column(name = "shoeCategory")
	private String shoe_Category;
	
	@Column(name = "shoeColor")
	private String shoe_Color;
	
	@Column(name = "shoeManufactureDate")
	private String shoe_ManufactureDate;
	
	@Column(name = "shoePrice")
	private Double shoe_Price;
	
	@Column(name = "shoeQuantity")
	private int shoe_Quantity;

	public int getShoe_ID() {
		return shoe_ID;
	}

	public void setShoe_ID(int shoe_ID) {
		this.shoe_ID = shoe_ID;
	}

	public String getShoe_Brand() {
		return shoe_Brand;
	}

	public void setShoe_Brand(String shoe_Brand) {
		this.shoe_Brand = shoe_Brand;
	}

	public String getShoe_Name() {
		return shoe_Name;
	}

	public void setShoe_Name(String shoe_Name) {
		this.shoe_Name = shoe_Name;
	}

	public String getShoe_Category() {
		return shoe_Category;
	}

	public void setShoe_Category(String shoe_Category) {
		this.shoe_Category = shoe_Category;
	}

	public String getShoe_Color() {
		return shoe_Color;
	}

	public void setShoe_Color(String shoe_Color) {
		this.shoe_Color = shoe_Color;
	}

	public String getShoe_ManufactureDate() {
		return shoe_ManufactureDate;
	}

	public void setShoe_ManufactureDate(String shoe_ManufactureDate) {
		this.shoe_ManufactureDate = shoe_ManufactureDate;
	}

	public Double getShoe_Price() {
		return shoe_Price;
	}

	public void setShoe_Price(Double shoe_Price) {
		this.shoe_Price = shoe_Price;
	}

	public int getShoe_Quantity() {
		return shoe_Quantity;
	}

	public void setShoe_Quantity(int shoe_Quantity) {
		this.shoe_Quantity = shoe_Quantity;
	}

	public ProductModel(String shoe_Brand, String shoe_Name, String shoe_Category, String shoe_Color,
			String shoe_ManufactureDate, Double shoe_Price, int shoe_Quantity) {
		super();
		this.shoe_Brand = shoe_Brand;
		this.shoe_Name = shoe_Name;
		this.shoe_Category = shoe_Category;
		this.shoe_Color = shoe_Color;
		this.shoe_ManufactureDate = shoe_ManufactureDate;
		this.shoe_Price = shoe_Price;
		this.shoe_Quantity = shoe_Quantity;
	}

	public ProductModel() {
	}
	



}
