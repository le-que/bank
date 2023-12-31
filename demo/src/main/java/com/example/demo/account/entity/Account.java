package com.example.demo.account.entity;

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

    public Account(String accountId, Bank bank, String accountNum, LocalDate opened, String owner, int balance_usd) {
        this.accountId = accountId;
        this.bank = bank;
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

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", bank=" + bank.getBankId() + '\'' +
                ", accountNum='" + accountNum + '\'' +
                ", opened=" + opened +
                ", owner='" + owner + '\'' +
                ", balance_usd=" + balance_usd +
                '}';
    }
}
