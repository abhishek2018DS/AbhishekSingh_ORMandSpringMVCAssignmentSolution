package com.greatlearning.crm.springbootmvcthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.crm.springbootmvcthymeleaf.model.Customer;

@Repository

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
