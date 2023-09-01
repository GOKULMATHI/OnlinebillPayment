package com.example.bill.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bill.model.Recharge;
import com.example.bill.repository.RechargeRepository;
import com.example.bill.service.RechargeService;
@Service
public class RechargeServiceImpl implements RechargeService {
	@Autowired
	private RechargeRepository rechargeRepository;
	@Override
	public boolean updateRecharge(Long id,Recharge recharge) {
//		userRepository.saveAndFlush(user);
		Optional<Recharge> existingRechargeOptional = rechargeRepository.findById(id);
		if(existingRechargeOptional.isPresent()) {
			Recharge rechargeExists = existingRechargeOptional.get();
			
			rechargeExists.setRechargeAmount(recharge.getRechargeAmount());
			rechargeExists.setPhoneNum(recharge.getPhoneNum());
			rechargeExists.setPaymentMethod(recharge.getPaymentMethod());
			rechargeExists.setValidity(recharge.getValidity());
			rechargeExists.setData(recharge.getData());
			rechargeRepository.save(rechargeExists);
			return true;
		} else {
			return false;
		}
		 
	}

}
