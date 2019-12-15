package com.sample.springboot.creditkart.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.springboot.creditkart.dao.AccountDao;
import com.sample.springboot.creditkart.entity.Account;

@Component
public class AccountManager {

    @Autowired
    AccountDao accountDao;

    public Account createAccount(Account user) {
        return accountDao.createAccount(user);
    }

    public Account getAccount(long accountId) {
        return accountDao.getAccount(accountId);
    }

    public void deleteAccount(long accountId) {
        accountDao.deleteAccount(accountId);
    }

    public Account updateAccount(Account input) {
        return accountDao.updateAccount(input);
    }

    public List<Account> getAllAccounts() {
        return accountDao.getAllAccounts();
    }

    public List<Account> getCustomerAccounts(long customerId) {
        return accountDao.getCustomerAccounts(customerId);
    }

}
