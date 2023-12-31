package com.example.demo.account.service;

import com.example.demo.repository.CustomerRepository;
import com.example.demo.account.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }

    public void addNewCustomer(Customer customer) {
        Optional<Customer> CustomerNumOptional = customerRepository
                .findByPersonId(customer.getPersonId());
        if (CustomerNumOptional.isPresent()) {
            throw new IllegalStateException("Customer id taken");
        }
        customerRepository.save(customer);
    }
    public void deleteCustomer(String CustomerId) {
        boolean exist = customerRepository.existsById(CustomerId);
        if (!exist) {
            throw new IllegalStateException("Customer " + CustomerId + " does not exist");
        }
        customerRepository.deleteById(CustomerId);
    }

    @Transactional
    public void updateCustomer (String CustomerId) {
        Customer a = customerRepository.findByPersonId(CustomerId).orElseThrow(() ->
                new IllegalStateException("Customer " + CustomerId + " does not exist"));
    }
}
