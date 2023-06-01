package com.izelozarslan.cohortshomework2.controller.contract;

import com.izelozarslan.cohortshomework2.dto.invoice.InvoiceDTO;
import com.izelozarslan.cohortshomework2.dto.invoice.InvoiceSaveRequestDto;
import com.izelozarslan.cohortshomework2.entity.Invoice;

import java.time.Month;
import java.util.List;

public interface InvoiceControllerContract {

    List<InvoiceDTO> findAll();

    InvoiceDTO save(InvoiceSaveRequestDto invoiceSaveRequestDto);

    List<InvoiceDTO> findAmountGreaterThan(double amount);

    Double findAverageAmountGreaterThan(double amount);


}
