package com.example.rest_customer.repository;


import com.example.rest_customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

 interface CustomerRepository extends JpaRepository<Customer, Long> {
}