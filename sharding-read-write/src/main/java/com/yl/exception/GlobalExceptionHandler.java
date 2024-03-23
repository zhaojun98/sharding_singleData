package com.yl.exception;

import com.yl.util.CommonResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author GoryLee
 * @Date 2022/11/15 20:26
 * @Version 1.0
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = CustomException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResultVo handler(CustomException customException){
      log.error("运行时异常--------->:", customException);
      return CommonResultVo.failed(customException.getMessage());
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResultVo handler(MethodArgumentNotValidException e){
        log.error("校验异常--------->:", e);
        ObjectError objectError = e.getBindingResult().getAllErrors().stream().findFirst().orElse(null);
        return CommonResultVo.failed(objectError.getDefaultMessage());
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResultVo handler(IllegalArgumentException e){
        log.error("Assert异常--------->", e);
        return CommonResultVo.failed(e.getMessage());
    }
}
