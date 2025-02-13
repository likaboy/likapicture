package config;

import com.lika.likapicturebackend.common.BaseResponse;
import com.lika.likapicturebackend.common.ResultUtils;
import com.lika.likapicturebackend.exception.BusinessException;
import com.lika.likapicturebackend.exception.ErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> handleException(BusinessException e) {
        log.error("BusinessException:",e);
        return ResultUtils.error(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> handleException(Exception e) {
        log.error("RuntimeException:", e);
        return ResultUtils.error(ErrorCode.SERVER_ERROR,"系统错误");
    }
}
