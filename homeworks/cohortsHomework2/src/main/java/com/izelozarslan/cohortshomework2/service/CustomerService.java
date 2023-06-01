package com.izelozarslan.cohortshomework2.service;

import com.izelozarslan.cohortshomework2.entity.Customer;
import com.izelozarslan.cohortshomework2.general.BaseEntityService;
import com.izelozarslan.cohortshomework2.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends BaseEntityService<Customer, CustomerRepository> {

    public CustomerService(CustomerRepository repository) {
        super(repository);
    }


}
