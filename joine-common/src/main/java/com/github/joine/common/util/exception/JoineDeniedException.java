package com.github.joine.common.util.exception;

/**
 * @author JenphyJohn
 * @date 2017-12-29 17:05:10
 * 403 授权拒绝
 */
public class JoineDeniedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public JoineDeniedException() {
    }

    public JoineDeniedException(String message) {
        super(message);
    }

    public JoineDeniedException(Throwable cause) {
        super(cause);
    }

    public JoineDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public JoineDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
