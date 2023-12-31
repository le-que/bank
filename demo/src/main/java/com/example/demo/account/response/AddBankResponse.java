package com.example.demo.account.response;

public class AddBankResponse {

    String coprId;
    String bankId;

    String rountingNum;

    public AddBankResponse(String coprId, String bankId, String rountingNum) {
        this.coprId = coprId;
        this.bankId = bankId;
        this.rountingNum = rountingNum;
    }

    public String getCoprId() {
        return coprId;
    }

    public void setCoprId(String coprId) {
        this.coprId = coprId;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getRountingNum() {
        return rountingNum;
    }

    public void setRountingNum(String rountingNum) {
        this.rountingNum = rountingNum;
    }
}
