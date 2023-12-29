package com.example.demo.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/account")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }

    @PostMapping
    public void newAccount(@RequestBody Account account) {
        accountService.addNewAccount(account);
    }

    @DeleteMapping(path = "{accountId}")
    public void deleteAccount(@PathVariable("accountId") String accoutId) {
        accountService.deleteAccount(accoutId);
    }



//    @PutMapping(path = "{accountId}")
//    public void updateBalance
//        @PathVariable("accountId") String accoutId, @RequestParam(required = True) int balance) {
//    }
}
