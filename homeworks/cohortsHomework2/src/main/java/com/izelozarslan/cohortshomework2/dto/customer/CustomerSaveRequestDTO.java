package com.izelozarslan.cohortshomework2.dto.customer;

public record CustomerSaveRequestDTO(String name,
                                     String surname,
                                     String address,
                                     String email,
                                     String sector
                                     ) {
}
