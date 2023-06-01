package com.izelozarslan.homework2.dto.user;

import com.izelozarslan.homework2.enums.EnumUserType;

public record UserDTO(Long id,
                      String firstName,
                      String lastName,
                      String username,
                      String email,
                      String phoneNumber,
                      EnumUserType userType
                      ) {
}
