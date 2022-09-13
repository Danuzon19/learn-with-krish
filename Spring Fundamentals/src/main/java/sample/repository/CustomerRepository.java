package com.danu.repository;

import com.danu.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
