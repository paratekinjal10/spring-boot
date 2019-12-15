package com.sample.springboot.creditkart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@Entity
@Table(name = "t_account")
@ApiModel(description = "All details about Customer's credit card Account. ")
public class Account {

    @Id
    @GeneratedValue
    private long accountId;
    private long customerId;
    private String bankName;
    private Double balance;
    private Double credit;

    public Account() {
    }

    public Account(long accountId, long customerId, String bankName,
            Double balance, Double credit) {
        super();
        this.accountId = accountId;
        this.customerId = customerId;
        this.bankName = bankName;
        this.balance = balance;
        this.credit = credit;
    }

    public Account(long customerId, String bankName, String bankId, Double balance,
            Double credit) {
        super();
        this.customerId = customerId;
        this.bankName = bankName;
        this.balance = balance;
        this.credit = credit;
    }

    public long getAccountId() {
        return accountId;
    }
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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
