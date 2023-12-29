package com.example.demo.account;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "account_id", columnDefinition = "VARCHAR(20)")
    private String accountId;
    @ManyToOne
    @JoinColumn(name = "bankId")
    private Bank bank;
//    @Column(name = "bank_id", columnDefinition = "VARCHAR(20)", nullable = false)
//    private String bankId;
    @Column(name = "corp_id", columnDefinition = "VARCHAR(20)", nullable = false)
    private String corpId;
    @Column(name = "accountNum", columnDefinition = "VARCHAR(100)", nullable = false)
    private String accountNum;
    @Column(name = "opened", columnDefinition = "DATE")
    private LocalDate opened;
    @Column(name = "owner", columnDefinition = "VARCHAR(20)")
    private String owner;
    @Column(name = "balance_usd", columnDefinition = "int")
    private int balance_usd;

    public Account() {
    }

    public Account(String accountId, Bank bank, String corpId, String accountNum, LocalDate opened, String owner, int balance_usd) {
        this.accountId = accountId;
        this.bank = bank;
        this.corpId = corpId;
        this.accountNum = accountNum;
        this.opened = opened;
        this.owner = owner;
        this.balance_usd = balance_usd;
    }

    public Account(Bank bank, String corpId, String accountNum, LocalDate opened, String owner, int balance_usd) {
        this.bank = bank;
        this.corpId = corpId;
        this.accountNum = accountNum;
        this.opened = opened;
        this.owner = owner;
        this.balance_usd = balance_usd;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }


    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public LocalDate getOpened() {
        return opened;
    }

    public void setOpened(LocalDate opened) {
        this.opened = opened;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance_usd() {
        return balance_usd;
    }

    public void setBalance_usd(int balance_usd) {
        this.balance_usd = balance_usd;
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", bank=" + bank.getBankId() +
                ", corpId='" + corpId + '\'' +
                ", accountNum='" + accountNum + '\'' +
                ", opened=" + opened +
                ", owner='" + owner + '\'' +
                ", balance_usd=" + balance_usd +
                '}';
    }
}
