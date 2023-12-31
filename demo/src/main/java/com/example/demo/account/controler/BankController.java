package com.example.demo.account.controler;

import com.example.demo.account.entity.Bank;
import com.example.demo.account.request.AddBankRequest;
import com.example.demo.account.response.AddBankResponse;
import com.example.demo.account.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddBankResponse newBank(@RequestBody AddBankRequest request) {
        return bankService.addNewBank(request.getCorpId(), request.getBankId(), request.getRountingNum());
    }

    @DeleteMapping(path = "{bankId}")
    public void deleteBank(@PathVariable("bankId") String bankId) {
        bankService.deleteBank(bankId);
    }

    @PutMapping(path = "{bankId}")
    public void updateBank (
            @PathVariable("bankId") String bankId,
            @RequestParam(required = false) String corpId,
            @RequestParam(required = false) String routingNum) {
        bankService.updateBank(bankId, corpId, routingNum);
    }

}
