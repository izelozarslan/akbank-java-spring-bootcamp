package com.izelozarslan.homework2.errormessages;

import com.izelozarslan.homework2.general.BaseErrorMessage;

public enum UserErrorMessage implements BaseErrorMessage {

    USER_NOT_FOUND("User not found"),
    USERNAME_AND_PHONE_NUMBER_DOES_NOT_MATCH("Username and phone number does not match"),
    EMAIL_AND_USERNAME_ARE_TAKEN("Email and Username are taken"),
    EMAIL_IS_TAKEN("Email is taken"),
    USERNAME_IS_TAKEN("Username is taken");

    private final String message;

    UserErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
