package com.example.demo.account.service;

import com.example.demo.account.entity.Account;
import com.example.demo.account.response.AddBankResponse;
import com.example.demo.repository.BankRepository;
import com.example.demo.repository.CorpRepository;
import com.example.demo.account.entity.Corporation;
import com.example.demo.account.entity.Bank;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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


    public AddBankResponse addNewBank(String corpId, String bankId, String routingNum) {
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

        return new AddBankResponse(corpId, bankId, routingNum);
    }

    public void deleteBank(String bankId) {
        boolean exist = bankRepository.existsById(bankId);
        if (!exist) {
            throw new IllegalStateException("bank " + bankId + " does not exist");
        }
        bankRepository.deleteById(bankId);
    }
    @Transactional
    public void updateBank (String bankId, String corpId, String routingNum) {
        Bank b = bankRepository.findById(bankId).orElseThrow(() ->
                new IllegalStateException("Bank " + bankId + " does not exist"));
        Corporation c;
        if (corpId == null) {
            c = corpRepository.getById(b.getCorp().getCorpId());
        } else {
            c = corpRepository.getById(corpId);
        }
        b.setCorp(c);
        if (routingNum == null) {
            b.setRoutingNum(b.getRoutingNum());
        } else {
            b.setRoutingNum(routingNum);
        }
    }
}
