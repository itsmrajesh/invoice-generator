package com.invoicegenerator.invoicegenerator.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invoicegenerator.invoicegenerator.model.Subscription;

public interface SubscriptionRepo extends JpaRepository<Subscription, Long> {

}
