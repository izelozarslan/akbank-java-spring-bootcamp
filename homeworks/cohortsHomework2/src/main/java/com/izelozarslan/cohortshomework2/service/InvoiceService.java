package com.izelozarslan.cohortshomework2.service;

import com.izelozarslan.cohortshomework2.entity.Invoice;
import com.izelozarslan.cohortshomework2.general.BaseEntityService;
import com.izelozarslan.cohortshomework2.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService extends BaseEntityService<Invoice, InvoiceRepository> {

    public InvoiceService(InvoiceRepository repository) {
        super(repository);
    }
}
