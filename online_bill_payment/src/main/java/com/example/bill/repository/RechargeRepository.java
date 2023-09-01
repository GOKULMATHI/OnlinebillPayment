package com.example.bill.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bill.model.Recharge;


public interface RechargeRepository extends JpaRepository<Recharge, Long>{
	Optional<Recharge> findById(Long id);
}
