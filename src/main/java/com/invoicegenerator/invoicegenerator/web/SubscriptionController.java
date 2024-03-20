package com.invoicegenerator.invoicegenerator.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invoicegenerator.invoicegenerator.model.Account;
import com.invoicegenerator.invoicegenerator.model.MyService;
import com.invoicegenerator.invoicegenerator.model.Payment;
import com.invoicegenerator.invoicegenerator.model.Subscription;
import com.invoicegenerator.invoicegenerator.service.SubscriptionService;

@RestController
@RequestMapping("/api/v1/manager/")
public class SubscriptionController {

	@Autowired
	private SubscriptionService subscriptionService;

	@GetMapping("/accounts/")
	public List<Account> getAllAccounts() {
		return subscriptionService.findAll();
	}

	@PostMapping("/accounts/")
	public Account createAccount(@RequestBody Account account) {
		return subscriptionService.save(account);
	}
	
	@GetMapping("/services/")
	public List<MyService> getAllService(){
		return subscriptionService.findAllServices();
	}
	
	@PostMapping("/services/")
	public MyService addNewService(@RequestBody MyService service) {
		return subscriptionService.createService(service);
	}
	
	@GetMapping("/payments/")
	public List<Payment> getAllPayments(){
		return subscriptionService.findAllPayments();
	}
	
	@PostMapping("/payments/")
	public Payment makePayment(@RequestBody Payment payment) {
		return subscriptionService.makePayment(payment);
	}

	
	@GetMapping("/subscriptions/")
	public List<Subscription> getAllSubscriptions(){
		return subscriptionService.findAllSubscriptions();
	}
	
	@PostMapping("/subscriptions/")
	public Subscription makeSubscription(@RequestBody Subscription subscription) {
		return subscriptionService.buySubscription(subscription);
	}
	
}
