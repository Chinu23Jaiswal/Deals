package com.shoppingEx.Deals.DealServices;

import java.util.List;

import com.shoppingEx.Deals.entity.Deal;
import com.shoppingEx.Deals.entity.Users;

public interface DealServicesIn {

	public List<Deal> getAlldeals();

	public Deal addDeal(Deal deal);

	public List<Users> getUsers();

	//public Deal getbyID(int parseInt);

}
