package com.ri.bootcamp.learn.exception;

public class CustomGenericException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CustomGenericException(final String errorCode, final String errorMsg, final String displayMessage,
            final Exception exceptionDetails) {
        super(displayMessage, exceptionDetails);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.displayMessage = displayMessage;
        this.exceptionDetails = exceptionDetails;
    }

    public CustomGenericException(final String errorCode, final String errorMsg, final String displayMessage) {
        super(displayMessage);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.displayMessage = displayMessage;
        this.exceptionDetails = new Exception("Error Code : " + errorCode + " - Message :" + errorMsg);
    }

    private final String errorCode;
    private final String errorMsg;
    private final String displayMessage;
    private final Exception exceptionDetails;

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public String getDisplayMessage() {
        return displayMessage;
    }

    public Exception getExceptionDetails() {
        return exceptionDetails;
    }

}
