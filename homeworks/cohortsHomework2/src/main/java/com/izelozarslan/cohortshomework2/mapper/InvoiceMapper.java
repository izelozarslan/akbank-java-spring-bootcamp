package com.izelozarslan.cohortshomework2.mapper;

import com.izelozarslan.cohortshomework2.dto.invoice.InvoiceDTO;
import com.izelozarslan.cohortshomework2.dto.invoice.InvoiceSaveRequestDto;
import com.izelozarslan.cohortshomework2.entity.Invoice;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {

    List<InvoiceDTO> toInvoiceDtoList(List<Invoice> invoiceList);

    Invoice toInvoice(InvoiceSaveRequestDto invoiceSaveRequestDto);

   InvoiceDTO toInvoiceDTO(Invoice invoice);
}
