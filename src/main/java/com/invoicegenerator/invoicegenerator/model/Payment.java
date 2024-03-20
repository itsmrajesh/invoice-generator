package com.invoicegenerator.invoicegenerator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private double price;
	private double discount;
	private double finalPrice;
	@Enumerated(EnumType.STRING)
	private PaymentStatus status;

	enum PaymentStatus {
		SUCCESS, PENDING, FAILURE
	}
}
