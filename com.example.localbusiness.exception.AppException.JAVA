com.example.localbusiness.exception.AppException
package com.example.localbusiness.exception;

/**
 * Root checked exception for application.
 */
public class AppException extends Exception {
    public AppException(String message) { super(message); }
    public AppException(String message, Throwable cause) { super(message, cause); }
}
