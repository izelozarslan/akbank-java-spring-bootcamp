package com.izelozarslan.akbankbootcamp.errormessages;

import com.izelozarslan.akbankbootcamp.general.BaseErrorMessage;

public enum CustomerErrorMessage implements BaseErrorMessage {

    CUSTOMER_NOT_FOUND("Customer not found");

    private final String message;

    CustomerErrorMessage(String message) {
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
