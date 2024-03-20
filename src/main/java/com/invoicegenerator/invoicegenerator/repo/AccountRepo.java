package com.invoicegenerator.invoicegenerator.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invoicegenerator.invoicegenerator.model.Account;

public interface AccountRepo extends JpaRepository<Account, Long> {

}
