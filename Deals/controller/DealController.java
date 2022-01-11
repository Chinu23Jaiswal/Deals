package com.shoppingEx.Deals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingEx.Deals.DealServices.DealServicesIn;
import com.shoppingEx.Deals.entity.Deal;
import com.shoppingEx.Deals.entity.Users;

@RestController
public class DealController {
	
	@Autowired
	public DealServicesIn ds;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello from controller";
	}
	
	@GetMapping("/users")
	public List<Deal> getAllItems(){
		return this.ds.getAlldeals();
	}
	
	@PostMapping("/users")
	public Deal addDeal(@RequestBody Deal deal) {
		return this.ds.addDeal(deal);
	}
	
	@GetMapping("/getusers")
	public List<Users> getUsers() {
		return this.ds.getUsers();
	}
//	
//	@GetMapping("/purchase/{id}")
//	public Deal update(@PathVariable String id) {
//		return this.ds.getbyID(Integer.parseInt(id));
//	}

}
