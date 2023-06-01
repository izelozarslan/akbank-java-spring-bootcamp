package com.izelozarslan.cohortshomework2.dto.customer;

public record CustomerDTO(Long id,
                          String name,
                          String surname,
                          String address,
                          String email,
                          String sector
                          ) {
}
