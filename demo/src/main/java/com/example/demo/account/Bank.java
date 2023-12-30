package com.example.demo.account;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bank")
public class Bank {
    @ManyToOne
    @JoinColumn(name = "corpId")
    private Corporation corp;
    @Id
    @Column(name = "bankId", columnDefinition = "VARCHAR(20)", nullable = false)
    private String bankId;
    @Column(name = "routing_num", columnDefinition = "VARCHAR(100)")
    private String routingNum;

    public Bank() {
    }

    public Bank(Corporation corp, String bankId, String routingNum) {
        this.corp = corp;
        this.bankId = bankId;
        this.routingNum = routingNum;
    }

    public Corporation getCorp() {
        return corp;
    }

    public void setCorp(Corporation corp) {
        this.corp = corp;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "corpId='" + corp + '\'' +
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
