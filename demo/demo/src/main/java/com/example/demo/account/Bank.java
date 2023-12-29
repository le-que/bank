package com.example.demo.account;

import jakarta.persistence.*;

@Entity
@Table(name = "bank")
public class Bank {
    @Column(name = "corp_id", columnDefinition = "VARCHAR(20)", nullable = false)
    private String corpId;
    @Id
    @Column(name = "bank_id", columnDefinition = "VARCHAR(20)", nullable = false)
    private String bankId;
    @Column(name = "routing_num", columnDefinition = "VARCHAR(100)")
    private String routingNum;

    public Bank() {
    }

    public Bank(String corpId, String bankId, String routingNum) {
        this.corpId = corpId;
        this.bankId = bankId;
        this.routingNum = routingNum;
    }

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
