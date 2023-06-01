package com.izelozarslan.cohortshomework2.controller;

import com.izelozarslan.cohortshomework2.controller.contract.CustomerControllerContract;
import com.izelozarslan.cohortshomework2.dto.customer.CustomerDTO;
import com.izelozarslan.cohortshomework2.dto.customer.CustomerSaveRequestDTO;
import com.izelozarslan.cohortshomework2.general.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerControllerContract customerControllerContract;


    @PostMapping
    public ResponseEntity<RestResponse<CustomerDTO>> save(CustomerSaveRequestDTO customerSaveRequestDTO) {
        CustomerDTO customerDTO = customerControllerContract.save(customerSaveRequestDTO);
        return ResponseEntity.ok(RestResponse.of(customerDTO));
    }

    @GetMapping
    public ResponseEntity<RestResponse<List<CustomerDTO>>> findAll(){
        List<CustomerDTO> customerDTOList = customerControllerContract.findAll();
        return ResponseEntity.ok(RestResponse.of(customerDTOList));
    }

    @GetMapping("/search/{letter}")
    public ResponseEntity<RestResponse<List<CustomerDTO>>> findByNameContainsLetter(@RequestParam String letter) {
        List<CustomerDTO> customerDTOList = customerControllerContract.findByNameContainsLetter(letter);
        return ResponseEntity.ok(RestResponse.of(customerDTOList));
    }

    @GetMapping("/total-amount/{month}")
    public ResponseEntity<RestResponse<Double>> getTotalInvoiceAmountForRegisteredInMonth(@RequestParam Month month) {
        Double amount = customerControllerContract.getTotalInvoiceAmountForRegisteredInMonth(month);
        return ResponseEntity.ok(RestResponse.of(amount));
    }

    @GetMapping("/low-value-invoices")
    public ResponseEntity<RestResponse<List<CustomerDTO>>> findCustomerNamesWithLowValueInvoices(double amount) {
        List<CustomerDTO> customerDTOList = customerControllerContract.findCustomerNamesWithLowValueInvoices(amount);
        return ResponseEntity.ok(RestResponse.of(customerDTOList));
    }

    @GetMapping("/average-invoice-below-amount")
    public ResponseEntity<RestResponse<List<String>>> findCompaniesWithAverageInvoiceBelowAmount(Month month, double amount){
        List<String> list = customerControllerContract.findCompaniesWithAverageInvoiceBelowAmount(month, amount);
        return ResponseEntity.ok(RestResponse.of(list));
    }


}
