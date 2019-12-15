package com.sample.springboot.creditkart.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.springboot.creditkart.entity.Account;


/**
 * This repository class executes CRUD operations on Entity Account
 *
 */
//@RepositoryRestResource(collectionResourceRel = "account", path = "account")
@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{

}
