package com.example.kartgp.exception;

public class DuplicateReceiptException extends Exception {

    public DuplicateReceiptException(String message) {
        super(message);
    }

    public DuplicateReceiptException(Throwable cause) {
        super(cause);
    }

    public DuplicateReceiptException(String message, Throwable cause) {
        super(message, cause);
    }

}
