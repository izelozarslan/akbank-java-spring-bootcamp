package com.izelozarslan.cohortshomework2.entity;

import com.izelozarslan.cohortshomework2.general.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CUSTOMER")
@Getter
@Setter
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(generator = "Customer", strategy = GenerationType.SEQUENCE)
    //Sequence generator name unique olmalı ki her entity için ayrı sequence oluşsun
    @SequenceGenerator(name = "Customer", sequenceName = "CUSTOMER_ID_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "SURNAME", length = 100, nullable = false)
    private String surname;

    @Column(name = "ADDRESS", length = 400, nullable = false)
    private String address;

    @Column(name = "SECTOR", length = 50)
    private String sector;

    @Email
    @Column(name = "EMAIL", length = 50)
    private String email;

    @OneToMany(cascade = CascadeType.ALL,
               fetch = FetchType.LAZY,
               mappedBy = "customer")
    private List<Invoice> invoiceList = new ArrayList<>();

}
