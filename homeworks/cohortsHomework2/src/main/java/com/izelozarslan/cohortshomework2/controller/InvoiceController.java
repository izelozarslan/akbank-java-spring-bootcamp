package com.izelozarslan.cohortshomework2.controller;

import com.izelozarslan.cohortshomework2.controller.contract.InvoiceControllerContract;
import com.izelozarslan.cohortshomework2.dto.invoice.InvoiceDTO;
import com.izelozarslan.cohortshomework2.dto.invoice.InvoiceSaveRequestDto;
import com.izelozarslan.cohortshomework2.entity.Invoice;
import com.izelozarslan.cohortshomework2.general.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/invoices")
@RequiredArgsConstructor
public class InvoiceController {

    private final InvoiceControllerContract invoiceControllerContract;

    @PostMapping
    public ResponseEntity<RestResponse<InvoiceDTO>> save(InvoiceSaveRequestDto invoiceSaveRequestDto){
        InvoiceDTO save = invoiceControllerContract.save(invoiceSaveRequestDto);
        return ResponseEntity.ok(RestResponse.of(save));
    }

    @GetMapping
    public ResponseEntity<RestResponse<List<InvoiceDTO>>> findAll() {
        List<InvoiceDTO> invoiceDTOList = invoiceControllerContract.findAll();
        return ResponseEntity.ok(RestResponse.of(invoiceDTOList));
    }

    @GetMapping("/greater-than/amount")
    public ResponseEntity<RestResponse<List<InvoiceDTO>>> findAmountGreaterThan(double amount) {
        List<InvoiceDTO> invoiceDTOList = invoiceControllerContract.findAmountGreaterThan(amount);
        return ResponseEntity.ok(RestResponse.of(invoiceDTOList));
    }

    @GetMapping("/average-amount-greater-than")
    public ResponseEntity<RestResponse<Double>> findAverageAmountGreaterThan(double amount) {
        Double averageAmountGreaterThan = invoiceControllerContract.findAverageAmountGreaterThan(amount);
        return ResponseEntity.ok(RestResponse.of(averageAmountGreaterThan));
    }


}
