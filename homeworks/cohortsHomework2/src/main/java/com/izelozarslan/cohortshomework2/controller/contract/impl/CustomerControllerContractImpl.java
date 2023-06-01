package com.izelozarslan.cohortshomework2.controller.contract.impl;

import com.izelozarslan.cohortshomework2.controller.contract.CustomerControllerContract;
import com.izelozarslan.cohortshomework2.dto.customer.CustomerDTO;
import com.izelozarslan.cohortshomework2.dto.customer.CustomerSaveRequestDTO;
import com.izelozarslan.cohortshomework2.entity.Customer;
import com.izelozarslan.cohortshomework2.entity.Invoice;
import com.izelozarslan.cohortshomework2.mapper.CustomerMapper;
import com.izelozarslan.cohortshomework2.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerControllerContractImpl implements CustomerControllerContract {

    private final CustomerService service;
    private final CustomerMapper mapper;

    @Override
    public List<CustomerDTO> findAll() {
        List<Customer> customerList = service.findAll();
        return customerList.stream()
                .map(mapper::toCustomerDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO save(CustomerSaveRequestDTO customerSaveRequestDTO) {
        Customer customer = mapper.toCustomer(customerSaveRequestDTO);
        service.save(customer);
        return mapper.toCustomerDTO(customer);
    }

    @Override
    public List<CustomerDTO> findByNameContainsLetter(String letter) {
        List<Customer> customerList = service.findAll();
        return customerList.stream()
                .filter(customer -> customer.getName()
                .contains(letter))
                .map(mapper::toCustomerDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Double getTotalInvoiceAmountForRegisteredInMonth(Month month) {
        List<Customer> customerList = service.findAll();
        return customerList.stream()
                .filter(customer -> customer.getBaseAdditionalFields().getCreateDate().getMonth() == month)
                .flatMap(customer -> customer.getInvoiceList().stream())
                .filter(invoice -> invoice.getBaseAdditionalFields().getCreateDate().getMonth() == month)
                .mapToDouble(Invoice::getAmount)
                .sum();
    }



    @Override
    public List<CustomerDTO> findCustomerNamesWithLowValueInvoices(double amount) {
        List<Customer> customerList = service.findAll();
        return customerList.stream()
                .filter(customer -> customer.getInvoiceList().stream()
                        .mapToDouble(Invoice::getAmount)
                        .anyMatch(invoiceAmount -> invoiceAmount < amount))
                .map(customer -> mapper.toCustomerDTO(customer))
                .collect(Collectors.toList());
    }

    @Override
    public List<String> findCompaniesWithAverageInvoiceBelowAmount(Month month, double amount) {
        List<Customer> customerList = service.findAll();

        return customerList.stream()
                .flatMap(customer -> customer.getInvoiceList().stream())
                .filter(invoice -> invoice.getBaseAdditionalFields().getCreateDate().getMonth() == month)
                .collect(Collectors.groupingBy(
                        invoice -> invoice.getCustomer().getSector(),
                        Collectors.averagingDouble(Invoice::getAmount)))
                .entrySet().stream()
                .filter(entry -> entry.getValue() < amount)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


    }
}

