package com.example.demo.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class BankService {
    private final BankRepository bankRepository;

    @Autowired
    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }
    public List<Bank> getBanks() {
        return bankRepository.findAll();
    }
    @PostMapping
    public void addNewBank(Bank bank) {
        Optional<Bank> BankNumOptional = bankRepository
                .findByBankId(bank.getBankId());
        if (BankNumOptional.isPresent()) {
            throw new IllegalStateException("account num taken");
        }
        bankRepository.save(bank);
    }

    public void deleteBank(String bankId) {
        boolean exist = bankRepository.existsById(bankId);
        if (!exist) {
            throw new IllegalStateException("bank " + bankId + " does not exist");
        }
        bankRepository.deleteById(bankId);
    }
}
