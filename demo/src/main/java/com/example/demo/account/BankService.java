package com.example.demo.account;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class BankService {
    private final BankRepository bankRepository;
    private final CorpRepository corpRepository;

    @Autowired
    public BankService(BankRepository bankRepository, CorpRepository corpRepository) {

        this.bankRepository = bankRepository;
        this.corpRepository = corpRepository;
    }
    public List<Bank> getBanks() {
        return bankRepository.findAll();
    }


    public void addNewBank(String corpId, String bankId, String routingNum) {
        System.out.println("add new bank");
        Optional<Bank> BankNumOptional = bankRepository
                .findByBankId(bankId);
        if (BankNumOptional.isPresent()) {
            throw new IllegalStateException("bank num taken");
        }
        Corporation corp = corpRepository.getById(corpId);
        if (corp == null) {
            throw new IllegalStateException("Corporation " + corpId + " does not exist");
        }
        Bank b = new Bank(corp, bankId, routingNum);
        bankRepository.save(b);
    }

    public void deleteBank(String bankId) {
        boolean exist = bankRepository.existsById(bankId);
        if (!exist) {
            throw new IllegalStateException("bank " + bankId + " does not exist");
        }
        bankRepository.deleteById(bankId);
    }
}
