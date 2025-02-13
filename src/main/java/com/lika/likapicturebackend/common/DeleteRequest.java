package com.lika.likapicturebackend.common;


import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 删除请求包装类
 */
@Data
public class DeleteRequest implements Serializable {

    private Long id;

    @Serial
    private static final long serialVersionUID = 1L;
}
