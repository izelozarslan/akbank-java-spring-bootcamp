package com.izelozarslan.cohortshomework2.controller.contract;

import com.izelozarslan.cohortshomework2.dto.customer.CustomerDTO;
import com.izelozarslan.cohortshomework2.dto.customer.CustomerSaveRequestDTO;

import java.time.Month;
import java.util.List;


public interface CustomerControllerContract {

    List<CustomerDTO> findAll();

    CustomerDTO save(CustomerSaveRequestDTO customerSaveRequestDTO);

    List<CustomerDTO> findByNameContainsLetter(String letter);

    Double getTotalInvoiceAmountForRegisteredInMonth(Month month);

    List <CustomerDTO> findCustomerNamesWithLowValueInvoices(double amount);

    /**İstenilen ayın(month) faturalarının ortalaması
     *  istenilen miktar(amount) altı olan firmaların sektörünün listesi */
    List<String> findCompaniesWithAverageInvoiceBelowAmount(Month month, double amount);


}
