package com.example.demo.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankService {
    private final BankRepository bankRepository;

    @Autowired
    public BankService (BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }
    public List<Bank> getBank() {
        return bankRepository.findAll();
    }
}
