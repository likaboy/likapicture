package com.lika.likapicturebackend.exception;

public class ThrowUtils {

    /**
     * 条件成立抛出异常
     *
     * @param condition        条件
     * @param runtimeException 异常
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    /**
     * 条件成立则抛出异常
     */
    public static void throwIf(boolean condition, ErrorCode errorCode) {
        if (condition) {
            throw new BusinessException(errorCode);
        }
    }

    /*
     * 条件成立则抛出异常
     */
    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        if (condition) {
            throw new BusinessException(errorCode, message);
        }
    }
}
