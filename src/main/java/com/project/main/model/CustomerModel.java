package com.project.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "customer_tbl")
@EnableTransactionManagement
public class CustomerModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userID")
	private int user_ID;
	
	@Column(name = "userName")
	private String user_Name;
	
	@Column(name = "userEmail")
	private String user_Email;
	
	@Column(name = "userPhone")
	private long user_Phone;

	public int getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getUser_Email() {
		return user_Email;
	}

	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}

	public long getUser_Phone() {
		return user_Phone;
	}

	public void setUser_Phone(long user_Phone) {
		this.user_Phone = user_Phone;
	}
	
	
}

