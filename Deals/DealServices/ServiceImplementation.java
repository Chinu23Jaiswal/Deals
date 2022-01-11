package com.shoppingEx.Deals.DealServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingEx.Deals.DealDao.DealDaoEx;
import com.shoppingEx.Deals.entity.Deal;
import com.shoppingEx.Deals.entity.Users;

@Service
public class ServiceImplementation implements DealServicesIn {

	@Autowired
	public DealDaoEx dde;
	
	List<Users> user1;
	public ServiceImplementation() {
		user1= new ArrayList<>();
		user1.add(new Users(1, "chinu", dde.findAll()));
	}
	@Override
	public List<Deal> getAlldeals() {
		return dde.findAll();
		
	}

	@Override
	public Deal addDeal(Deal deal) {
		dde.save(deal);
		return deal;
	}

	@Override
	public List<Users> getUsers() {
		
		return user1;
	}
//	@Override
//	public Deal getbyID(int id) {
//		Deal d=null;
//		
//		d=dde.getOne(id);
//		Users userID= user1.get(0);
//		if(d.getId()==userID.getId()) {
//			int quat= d.getQuantity()-1;
//			d.setQuantity(quat);
//		}
//		return d;
//	}

}
