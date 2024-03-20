package com.invoicegenerator.invoicegenerator.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.invoicegenerator.invoicegenerator.model.Account;
import com.invoicegenerator.invoicegenerator.model.MyService;
import com.invoicegenerator.invoicegenerator.model.Payment;
import com.invoicegenerator.invoicegenerator.model.Subscription;
import com.invoicegenerator.invoicegenerator.repo.AccountRepo;
import com.invoicegenerator.invoicegenerator.repo.PaymentRepo;
import com.invoicegenerator.invoicegenerator.repo.ServiceRepo;
import com.invoicegenerator.invoicegenerator.repo.SubscriptionRepo;

@Service
public class SubscriptionService {

	private AccountRepo accountRepo;

	private ServiceRepo serviceRepo;

	private PaymentRepo paymentRepo;

	private SubscriptionRepo subscriptionRepo;

	public SubscriptionService(AccountRepo accountRepo, ServiceRepo serviceRepo, PaymentRepo paymentRepo,
			SubscriptionRepo subscriptionRepo) {
		super();
		this.accountRepo = accountRepo;
		this.serviceRepo = serviceRepo;
		this.paymentRepo = paymentRepo;
		this.subscriptionRepo = subscriptionRepo;
	}

	public List<Account> findAll() {
		return accountRepo.findAll();
	}

	public Account save(Account account) {
		return accountRepo.save(account);
	}

	public List<MyService> findAllServices() {
		return serviceRepo.findAll();
	}

	public MyService createService(MyService service) {
		return serviceRepo.save(service);
	}

	public List<Payment> findAllPayments() {
		return paymentRepo.findAll();
	}

	public Payment makePayment(Payment payment) {
		return paymentRepo.save(payment);
	}

	public List<Subscription> findAllSubscriptions() {
		return subscriptionRepo.findAll();
	}

	public Subscription buySubscription(Subscription subscription) {
		return subscriptionRepo.save(subscription);
	}
}
