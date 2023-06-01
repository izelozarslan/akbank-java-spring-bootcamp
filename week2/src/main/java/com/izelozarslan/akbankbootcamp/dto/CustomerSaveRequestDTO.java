package com.izelozarslan.akbankbootcamp.dto;

import com.izelozarslan.akbankbootcamp.enums.EnumStatus;

import java.time.LocalDate;

public record CustomerSaveRequestDTO(String name,
                                     String surname,
                                     String username,
                                     String password,
                                     String email,
                                     LocalDate birthDate,
                                     EnumStatus status) {


}

