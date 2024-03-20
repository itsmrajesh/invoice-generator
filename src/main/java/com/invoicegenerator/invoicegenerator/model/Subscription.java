package com.invoicegenerator.invoicegenerator.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Subscription {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	@JoinColumn(name = "serviceID", referencedColumnName = "id")
	private MyService myService;

	@ManyToOne
	@JoinColumn(name = "accountID", referencedColumnName = "id")
	private Account account;

	@ManyToOne
	@JoinColumn(name = "paymentID", referencedColumnName = "id")
	private Payment payment;

	private LocalDateTime startDate;
	private LocalDateTime endDate;
}
