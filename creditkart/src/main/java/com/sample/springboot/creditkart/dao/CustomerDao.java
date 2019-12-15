package com.sample.springboot.creditkart.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sample.springboot.creditkart.entity.Customer;


/**
 * This dao class executes CRUD operations on Entity Customer
 *
 */
@Repository
@Transactional
public class CustomerDao {

    @PersistenceContext
    EntityManager entityManager;

    public Customer createCustomer(Customer customer) {
        return entityManager.merge(customer);
    }

    public Customer getCustomer(Long customerId) {
        return entityManager.find(Customer.class, customerId);
    }

    public Customer updateCustomer(Customer customer) {
        return entityManager.merge(customer);
    }

    public void deleteCustomer(Long customerId) {
        Customer customer = entityManager.find(Customer.class, customerId);
        entityManager.remove(customer);
    }

    public List<Customer> getAllCustomer() {
        TypedQuery<Customer> namedQuery = entityManager.createNamedQuery("get_all_customer", Customer.class);
        return namedQuery.getResultList();
    }
}
