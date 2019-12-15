package com.sample.springboot.creditkart.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springboot.creditkart.constants.Constants;
import com.sample.springboot.creditkart.entity.Account;
import com.sample.springboot.creditkart.manager.AccountManager;

import io.swagger.annotations.ApiOperation;

/**
 * Controller class to handle account entity's CRUD operations
 *
 */
@RestController
@RequestMapping(value = Constants.ACCOUNT_BASE_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountController {

    private static final Logger log = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    AccountManager accountManager;

    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createAccount(@RequestBody Account account) {
        accountManager.createAccount(account);
        return "Account created Successfully!";
    }

    @GetMapping(value = "/get/{accountId}")
    public Account getAccount(@PathVariable long accountId) {
        return accountManager.getAccount(accountId);
    }

    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String updateAccount(@RequestBody Account input) {
        accountManager.updateAccount(input);
        return "Account updated successfully!";
    }

    @PostMapping(value = "/delete/{accountId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String deleteAccount(@PathVariable long accountId) {
        accountManager.deleteAccount(accountId);
        return "Account deleted successfully!";
    }

    @ApiOperation(value = "View all existing accounts", response = List.class)
    @GetMapping(value = "/all")
    public List<Account> getAllAccounts() {
        log.info("accounts request received");
        List<Account> accounts = accountManager.getAllAccounts();
        return accounts;
    }

    @ApiOperation(value = "View all existing accounts of a customer", response = List.class)
    @GetMapping(value = "/all/{customerId}")
    public List<Account> getCustomerAccounts(@PathVariable long customerId) {
        log.info("accounts request received");
        List<Account> accounts = accountManager.getCustomerAccounts(customerId);
        return accounts;
    }

}
