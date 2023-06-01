package com.izelozarslan.akbankbootcamp.training;

import jakarta.validation.constraints.NotBlank;


public record UserSaveRequestDTO(@NotBlank String name,
                                 @NotBlank String surname) {
}
