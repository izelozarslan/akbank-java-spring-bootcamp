package com.izelozarslan.cohortshomework2.repository;

import com.izelozarslan.cohortshomework2.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
