package com.shoppingEx.Deals.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Deal {
	
	@Id
	int id;
	String name;
	int quantity;
	double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Deal(int id, String name, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public Deal() {
		super();
	}
	@Override
	public String toString() {
		return "Deal [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}

}
