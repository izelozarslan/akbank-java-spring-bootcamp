package com.izelozarslan.homework2.dto.user;

import com.izelozarslan.homework2.enums.EnumUserType;

public record UserSaveRequest(String firstName,
                              String lastName,
                              String username,
                              String password,
                              String email,
                              String phoneNumber,
                              EnumUserType userType
                              ) {
}
