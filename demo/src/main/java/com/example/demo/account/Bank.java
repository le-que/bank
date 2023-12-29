package com.example.demo.account;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bank")
public class Bank {
    @Column(name = "corp_id", columnDefinition = "VARCHAR(20)", nullable = false)
    private String corpId;
    @Id
    @Column(name = "bankId", columnDefinition = "VARCHAR(20)", nullable = false)
    private String bankId;
    @Column(name = "routing_num", columnDefinition = "VARCHAR(100)")
    private String routingNum;
//    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
//    private List<Account> account = new ArrayList<>();

    public Bank() {
    }
    public Bank(String corpId, String bankId, String routingNum) {
        this.corpId = corpId;
        this.bankId = bankId;
        this.routingNum = routingNum;
    }



    @Override
    public String toString() {
        return "Bank{" +
                "corpId='" + corpId + '\'' +
                ", bankId='" + bankId + '\'' +
                ", routingNum='" + routingNum + '\'' +
                '}';
    }

//    public List<Account> getAccount() {
//        return account;
//    }
//
//    public void setAccount(List<Account> account) {
//        this.account = account;
//    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getRoutingNum() {
        return routingNum;
    }

    public void setRoutingNum(String routingNum) {
        this.routingNum = routingNum;
    }
}
