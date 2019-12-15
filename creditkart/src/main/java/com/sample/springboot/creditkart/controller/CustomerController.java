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
import com.sample.springboot.creditkart.entity.Customer;
import com.sample.springboot.creditkart.manager.CustomerManager;

import io.swagger.annotations.ApiOperation;

/**
 * Controller class to handle customer entity's CRUD operations
 *
 */
@RestController
@RequestMapping(value = Constants.CUSTOMER_BASE_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {

    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    CustomerManager customerManager;

    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createCustomer(@RequestBody Customer customer) {
        customerManager.createCustomer(customer);
        return "Customer created Successfully!";
    }

    @GetMapping(value = "/get/{customerId}")
    public Customer getUser(@PathVariable Long customerId) {
        return customerManager.getCustomer(customerId);
    }

    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String updateCustomer(@RequestBody Customer input) {
        customerManager.updateCustomer(input);
        return "Customer updated successfully!";
    }

    @PostMapping(value = "/delete/{customerId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String deleteUser(@PathVariable Long customerId) {
        customerManager.deleteCustomer(customerId);
        return "Customer deleted successfully!";
    }

    @ApiOperation(value = "View all existing customers", response = List.class)
    @GetMapping(value = "/all")
    public List<Customer> getAllUser() {
        log.info("customers request receiveds");
        List<Customer> customers = customerManager.getAllCustomer();
        return customers;
    }

}
