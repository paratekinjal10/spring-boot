package com.sample.springboot.creditkart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "t_customer")
@NamedQuery(name = "get_all_customer", query = "select c from Customer c")
@ApiModel(description = "All details about the Customer. ")
public class Customer {

    @Id
    @GeneratedValue
    @ApiModelProperty(notes = "The database generated customer Id")
    private long customerId;
    private String name;
    private String address;
    private String username;
    private String password;
    @ApiModelProperty(notes = "True if customer has admin access")
    private Boolean isAdmin;

    public Customer() {

    }

    public Customer(long customerId, String name, String address,
            String username, String password, Boolean isAdmin) {
        super();
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public Customer(String name, String address, String username,
            String password, Boolean isAdmin) {
        super();
        this.name = name;
        this.address = address;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
