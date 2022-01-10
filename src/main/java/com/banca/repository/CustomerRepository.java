package com.banca.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.banca.model.Customer;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {

}
