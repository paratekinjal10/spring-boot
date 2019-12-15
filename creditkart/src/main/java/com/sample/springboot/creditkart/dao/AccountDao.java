package com.sample.springboot.creditkart.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.sample.springboot.creditkart.entity.Account;

@Repository
@Transactional
public class AccountDao {

    @PersistenceContext
    EntityManager entityManager;

    private static final Logger log = LoggerFactory.getLogger(AccountDao.class);

    public Account createAccount(Account account) {
        return entityManager.merge(account);
    }

    public Account getAccount(long accountId) {
        Account account = entityManager.find(Account.class, accountId);
        log.info(account.toString());
        return account;
    }

    public void deleteAccount(long accountId) {
        Account account = entityManager.find(Account.class, accountId);
        entityManager.remove(account);
    }

    public Account updateAccount(Account input) {
        return entityManager.merge(input);
    }

    @SuppressWarnings("unchecked")
    public List<Account> getAllAccounts() {
        return entityManager.createQuery("select a from Account a")
                .getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<Account> getCustomerAccounts(long customerId) {
        return entityManager.createQuery("select a from Account a "
                + "where a.customerId = :customerId")
                .setParameter("customerId", customerId)
                .getResultList();
    }

}
