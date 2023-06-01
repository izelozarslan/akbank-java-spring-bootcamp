package com.izelozarslan.homework2.errormessages;

import com.izelozarslan.homework2.general.BaseErrorMessage;

public enum CommentErrorMessage implements BaseErrorMessage {
    COMMENT_DOES_NOT_EXISTS_CUSTOMER("Customer has not commented before"),
    COMMENT_DOES_NOT_EXISTS_PRODUCT("There are no comments yet on this product.");

    private String message;
    CommentErrorMessage(String message) {
        this.message = message;
    }


    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
