package com.project.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "purchase_tbl")
@EnableTransactionManagement
public class PurchaseModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "purchaseID")
	private int purchase_ID;
	
	@Column(name = "userID")
	private int user_ID;
	
//	@Column(name = "shoeID")
//	private int shoe_ID;
	
	@OneToOne
	@JoinColumn(name = "shoeID")
	private ProductModel productModel;
	
	@Column(name = "purchaseQuantity")
	private int purchase_Quantity;
	
	@Column(name = "purchaseDate")
	private String purchase_Date;

	public int getPurchase_ID() {
		return purchase_ID;
	}

	public void setPurchase_ID(int purchase_ID) {
		this.purchase_ID = purchase_ID;
	}

	public int getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	public ProductModel getProductModel() {
		return productModel;
	}

	public void setProductModel(ProductModel productModel) {
		this.productModel = productModel;
	}

	public int getPurchase_Quantity() {
		return purchase_Quantity;
	}

	public void setPurchase_Quantity(int purchase_Quantity) {
		this.purchase_Quantity = purchase_Quantity;
	}

	public String getPurchase_Date() {
		return purchase_Date;
	}

	public void setPurchase_Date(String purchase_Date) {
		this.purchase_Date = purchase_Date;
	}

	public PurchaseModel() {
	}

	public PurchaseModel(int purchase_ID, int user_ID, ProductModel productModel, int purchase_Quantity,
			String purchase_Date) {
		super();
		this.purchase_ID = purchase_ID;
		this.user_ID = user_ID;
		this.productModel = productModel;
		this.purchase_Quantity = purchase_Quantity;
		this.purchase_Date = purchase_Date;
	}

	@Override
	public String toString() {
		return "PurchaseModel [purchase_ID=" + purchase_ID + ", user_ID=" + user_ID + ", productModel=" + productModel
				+ ", purchase_Quantity=" + purchase_Quantity + ", purchase_Date=" + purchase_Date + "]";
	}
	
	
	
	


}
