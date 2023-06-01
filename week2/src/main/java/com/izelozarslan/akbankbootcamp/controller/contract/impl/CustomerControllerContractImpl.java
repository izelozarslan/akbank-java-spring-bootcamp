package com.izelozarslan.akbankbootcamp.controller.contract.impl;

import com.izelozarslan.akbankbootcamp.controller.contract.CustomerControllerContract;
import com.izelozarslan.akbankbootcamp.dto.CustomerDTO;
import com.izelozarslan.akbankbootcamp.dto.CustomerSaveRequestDTO;
import com.izelozarslan.akbankbootcamp.entity.Customer;
import com.izelozarslan.akbankbootcamp.mapper.CustomerMapper;
import com.izelozarslan.akbankbootcamp.service.entityservice.CustomerEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerControllerContractImpl implements CustomerControllerContract {

    private final CustomerEntityService customerEntityService;

    @Override
    public CustomerDTO save(CustomerSaveRequestDTO requestDTO) {

        Customer customer = CustomerMapper.INSTANCE.convertToCustomer(requestDTO);

        customer = customerEntityService.save(customer);

        CustomerDTO customerDTO = CustomerMapper.INSTANCE.convertToCustomerDTO(customer);

        return customerDTO;
    }

    @Override
    public List<CustomerDTO> findAll() {

        List<Customer> customerList = customerEntityService.findAll();

        return CustomerMapper.INSTANCE.convertToCustomerDTOList(customerList);
    }

    @Override
    public void delete(Long id) {
        customerEntityService.delete(id);
    }
}
