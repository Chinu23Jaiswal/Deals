package com.shoppingEx.Deals.DealDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingEx.Deals.entity.Deal;

public interface DealDaoEx extends JpaRepository<Deal, Integer> {

}
