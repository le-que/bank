package com.example.demo.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bank")
public class BankController {
    private final BankService bankService;

    @Autowired
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping
    public List<Bank> getBanks() {
        return bankService.getBanks();
    }

    @PostMapping(path = "{bankId}")
    public void newBank(@RequestParam(required = true) String corpId,
                        @PathVariable("bankId") String bankId,
                        @RequestParam(required = true) String routingNum) {
        bankService.addNewBank(corpId, bankId, routingNum);
    }

    @DeleteMapping(path = "{bankId}")
    public void deleteBank(@PathVariable("bankId") String bankId) {
        bankService.deleteBank(bankId);
    }

}
