package com.example.demo.account.service;

import com.example.demo.repository.AccountRepository;
import com.example.demo.account.entity.Account;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AccountService {
    private final AccountRepository accountRepository;
    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    public void addNewAccount(Account account) {
        Optional<Account> AccountNumOptional = accountRepository
                .findByAccountNum(account.getAccountNum());
        if (AccountNumOptional.isPresent()) {
            throw new IllegalStateException("account num taken");
        }
        accountRepository.save(account);
    }
    public void deleteAccount(String accountId) {
        boolean exist = accountRepository.existsById(accountId);
        if (!exist) {
            throw new IllegalStateException("account " + accountId + " does not exist");
        }
        accountRepository.deleteById(accountId);
    }

    @Transactional
    public void updateAccount (String accountId, int balance, String owner) {
        Account a = accountRepository.findById(accountId).orElseThrow(() ->
                new IllegalStateException("account " + accountId + " does not exist"));
        a.setBalance_usd(balance);
        a.setOwner(owner);
    }
}
