package dev.martintaylor.ehrimportservice.exception.base;

public abstract class UploadException extends RuntimeException {
    public UploadException(String message) {
        super(message);
    }
}