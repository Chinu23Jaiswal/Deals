package com.shoppingEx.Deals.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Users {
	
	
	private int id;
	private String name;
	private List<Deal> deal;
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
	public List<Deal> getDeal() {
		return deal;
	}
	public void setDeal(List<Deal> deal) {
		this.deal = deal;
	}
	public Users(int id, String name, List<Deal> deal) {
		super();
		this.id = id;
		this.name = name;
		this.deal = deal;
	}
	public Users() {
		super();
	}

}
