package com.i1314i.ourproject.shiro.exception;

import org.apache.shiro.authc.AccountException;

/**
 * @author 平行时空
 * @created 2018-09-19 21:52
 **/
public class CodeException extends AccountException {
    public CodeException() {
        super();
    }

    public CodeException(String message) {
        super(message);
    }

    public CodeException(String message, Throwable cause) {
        super(message, cause);
    }
}
