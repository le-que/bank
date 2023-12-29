package com.example.demo.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    public List<Account> getAccount() {
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
}
