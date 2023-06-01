package com.izelozarslan.cohortshomework2.repository;

import com.izelozarslan.cohortshomework2.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface InvoiceRepository extends JpaRepository<Invoice,Long> {
}
