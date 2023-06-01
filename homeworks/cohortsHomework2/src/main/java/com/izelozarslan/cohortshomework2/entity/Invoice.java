package com.izelozarslan.cohortshomework2.entity;

import com.izelozarslan.cohortshomework2.general.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "INVOICE")
@Getter
@Setter
public class Invoice extends BaseEntity{

    @Id
    @GeneratedValue(generator = "Invoice", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "Invoice", sequenceName = "INVOICE_ID_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "AMOUNT")
    private Double amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CUSTOMER", nullable = false)
    private Customer customer;
}
