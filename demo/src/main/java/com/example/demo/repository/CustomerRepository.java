package com.example.demo.repository;

import com.example.demo.account.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    @Query("SELECT c FROM Customer c WHERE c.personId = ?1")
    Optional<Customer> findByPersonId(String personId);
}
