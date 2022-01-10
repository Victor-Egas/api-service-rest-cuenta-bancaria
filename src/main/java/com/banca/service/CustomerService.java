package com.banca.service;

import com.banca.model.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {

	public Flux<Customer> findAll();
	
	public Mono<Customer> findById(String id);
	
	public Mono<Customer> save(Customer Customer);
	
	public Mono<Void> delete(Customer Customer);
	
	public Mono<Customer> update(Customer Customer);
	

}
