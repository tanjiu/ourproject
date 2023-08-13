package com.i1314i.ourproject.shiro.exception;

/**
 * @author 平行时空
 * @created 2018-09-19 22:25
 **/
public class UserException extends Exception {
    public UserException() {
        super();
    }

    public UserException(String message) {
        super(message);
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }
}
