package com.example.demo.account;

import jakarta.persistence.Column;

import java.io.Serializable;

public class BankId implements Serializable {
    private String corpId;
    private String bankId;

    public BankId(String corpId, String bankId) {
        this.corpId = corpId;
        this.bankId = bankId;
    }
}
