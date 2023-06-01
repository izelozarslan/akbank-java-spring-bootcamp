package com.izelozarslan.akbankbootcamp.service.entityservice;

import com.izelozarslan.akbankbootcamp.dao.CustomerRepository;
import com.izelozarslan.akbankbootcamp.entity.Customer;
import com.izelozarslan.akbankbootcamp.general.BaseEntityService;
import org.springframework.stereotype.Service;


@Service
public class CustomerEntityService extends BaseEntityService<Customer, CustomerRepository> {

    public CustomerEntityService(CustomerRepository repository) {
        super(repository);
    }
}
