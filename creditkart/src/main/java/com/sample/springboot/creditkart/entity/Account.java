package com.sample.springboot.creditkart.entity;

public class Account {

    private long accountId;
    private long userId;
    private String bankName;
    private String bankId;
    private Double balance;
    private Double credit;

    public Account() {
    }

    public Account(long accountId, long userId, String bankName,
            String bankId, Double balance, Double credit) {
        super();
        this.accountId = accountId;
        this.userId = userId;
        this.bankName = bankName;
        this.bankId = bankId;
        this.balance = balance;
        this.credit = credit;
    }

    public long getAccountId() {
        return accountId;
    }
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBankId() {
        return bankId;
    }
    public void setBankId(String bankId) {
        this.bankId = bankId;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Double getCredit() {
        return credit;
    }
    public void setCredit(Double credit) {
        this.credit = credit;
    }

}
