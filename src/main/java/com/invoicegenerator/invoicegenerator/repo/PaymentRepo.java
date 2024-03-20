package com.invoicegenerator.invoicegenerator.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invoicegenerator.invoicegenerator.model.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Long> {

}
