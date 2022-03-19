package com.greatlearning.crm.springbootmvcthymeleaf.service;

import java.util.List;
import org.springframework.data.domain.Page;
import com.greatlearning.crm.springbootmvcthymeleaf.model.Customer;


public interface CustomerService {
	List<Customer> getAllCustomers();
	void saveCustomer(Customer customer);
	Customer getCustomerById(long id);
	void deleteCustomerById(long id);
	Page<Customer> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}