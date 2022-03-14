package com.project.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.main.model.CustomerModel;

public interface CustomerRepository extends JpaRepository<CustomerModel, Integer> {

}
