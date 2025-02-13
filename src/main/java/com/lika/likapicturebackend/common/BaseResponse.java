package com.lika.likapicturebackend.common;


import com.lika.likapicturebackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 基础响应类
 */
@Data
public class BaseResponse<T> implements Serializable {
    private int code;
    private T data;
    private String message;


    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
