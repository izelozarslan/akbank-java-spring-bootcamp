package com.izelozarslan.cohortshomework2.controller.contract.impl;

import com.izelozarslan.cohortshomework2.controller.contract.InvoiceControllerContract;
import com.izelozarslan.cohortshomework2.dto.invoice.InvoiceDTO;
import com.izelozarslan.cohortshomework2.dto.invoice.InvoiceSaveRequestDto;
import com.izelozarslan.cohortshomework2.entity.Customer;
import com.izelozarslan.cohortshomework2.entity.Invoice;
import com.izelozarslan.cohortshomework2.mapper.InvoiceMapper;
import com.izelozarslan.cohortshomework2.service.CustomerService;
import com.izelozarslan.cohortshomework2.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InvoiceControllerContractImpl implements InvoiceControllerContract {

    private final InvoiceService invoiceService;
    private final InvoiceMapper mapper;
    private final CustomerService customerService;

    @Override
    public List<InvoiceDTO> findAll() {
        List<Invoice> invoiceList = invoiceService.findAll();
        return invoiceList.stream().map(mapper::toInvoiceDTO).collect(Collectors.toList());
    }

    @Override
    public InvoiceDTO save(InvoiceSaveRequestDto invoiceSaveRequestDto) {
        Customer customer = customerService.findByIdWithControl(invoiceSaveRequestDto.customerId());
        Invoice invoice = mapper.toInvoice(invoiceSaveRequestDto);
        invoice.setCustomer(customer);
        invoiceService.save(invoice);
        return mapper.toInvoiceDTO(invoice);
    }

    @Override
    public List<InvoiceDTO> findAmountGreaterThan(double amount) {
        List<Invoice> invoiceList = invoiceService.findAll();
        return invoiceList.stream()
                .filter(invoice -> invoice.getAmount() > amount)
                .map(mapper::toInvoiceDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Double findAverageAmountGreaterThan(double amount) {
        List<Invoice> invoiceList = invoiceService.findAll();
        return invoiceList.stream()
                .filter(invoice -> invoice.getAmount() > amount)
                .mapToDouble(Invoice::getAmount)
                .average()
                .orElse(0.0);

    }

}
