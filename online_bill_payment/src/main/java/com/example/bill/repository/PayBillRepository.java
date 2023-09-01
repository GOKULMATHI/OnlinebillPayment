package com.example.bill.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bill.model.PayBill;

public interface PayBillRepository extends JpaRepository<PayBill, Long> {

}
