package com.example.demo.account.request;

public class AddBankRequest {
    String corpId;
    String bankId;

    String rountingNum;

    public AddBankRequest() {
    }

    public AddBankRequest(String corpId, String bankId, String rountingNum) {
        this.corpId = corpId;
        this.bankId = bankId;
        this.rountingNum = rountingNum;
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

    public String getRountingNum() {
        return rountingNum;
    }

    public void setRountingNum(String rountingNum) {
        this.rountingNum = rountingNum;
    }
}
