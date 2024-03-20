package com.invoicegenerator.invoicegenerator.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invoicegenerator.invoicegenerator.model.MyService;

public interface ServiceRepo extends JpaRepository<MyService, Long> {

}
