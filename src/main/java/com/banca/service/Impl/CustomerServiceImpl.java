package com.banca.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banca.model.Customer;
import com.banca.repository.CustomerRepository;
import com.banca.service.CustomerService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	@Override
	public Flux<Customer> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<Customer> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<Customer> save(Customer customer) {
		return repo.save(customer);
	}

	@Override
	public Mono<Void> delete(Customer customer) {
		return repo.delete(customer);
	}

	@Override
	public Mono<Customer> update(Customer customer) {
		return repo.save(customer);
	}

}
