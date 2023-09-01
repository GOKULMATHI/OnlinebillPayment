package com.example.bill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bill.model.Recharge;
import com.example.bill.service.RechargeService;

@RestController
@RequestMapping("/api/v1/user")
public class RechargeController {
	@Autowired
	private RechargeService rechargeService;
	@PutMapping("/updateRecharge/{id}")
	public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody Recharge recharge){
		boolean rechargeData = rechargeService.updateRecharge(id,recharge);
		if(rechargeData) {
			return ResponseEntity.status(200).body("User updated successfully");
		} else{
			return ResponseEntity.status(404).body("No record found to be updated");
		}
	}
}
