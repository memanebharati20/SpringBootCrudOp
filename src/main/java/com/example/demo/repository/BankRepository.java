package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bank;

@Repository
public interface BankRepository extends CrudRepository<Bank, Integer> {

}
