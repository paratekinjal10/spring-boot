package com.sample.springboot.creditkart.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.springboot.creditkart.dao.CustomerDao;
import com.sample.springboot.creditkart.entity.Customer;

/**
 * This manager class manages CRUD operations on Customer Entity
 *
 */
@Component
public class CustomerManager {

    @Autowired
    CustomerDao customerDao;

    public Customer createCustomer(Customer customer) {
        return customerDao.createCustomer(customer);
    }

    public Customer getCustomer(Long customer) {
        return customerDao.getCustomer(customer);
    }

    public void deleteCustomer(Long customer) {
        customerDao.deleteCustomer(customer);
    }

    public Customer updateCustomer(Customer customer) {
        return customerDao.updateCustomer(customer);
    }

    public List<Customer> getAllCustomer() {
        return customerDao.getAllCustomer();
    }

}
