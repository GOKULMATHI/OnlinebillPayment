package com.example.bill.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.bill.model.Recharge;


public interface RechargeService {
	@Autowired
	public boolean updateRecharge(Long id, Recharge recharge);
}
