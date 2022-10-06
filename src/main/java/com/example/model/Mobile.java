package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Mobile {
	@Id
	@Column
	private int id;
	@Column
	private String mobileName;
	@Column
	private int price;
	
	public Mobile() {
		super();
	}

	public Mobile(int id, String mobileName, int price) {
		super();
		this.id = id;
		this.mobileName = mobileName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobileName=" + mobileName + ", price=" + price + "]";
	}
	
	
	
	
	

}
