package com.example.chaorenjob.configuration;

import com.example.chaorenjob.exception.CommonException;
import com.example.chaorenjob.model.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一的异常处理
 */
@ControllerAdvice
public class DefaultExceptionHandle {
    @ExceptionHandler
    @ResponseBody
    public Result defaultExceptionHandle(Exception e) {
        if (e instanceof CommonException) {
            CommonException commonException = (CommonException) e;
            Result result = Result.fail();
            result.setCode(commonException.getCode());
            result.setMsg(commonException.getMsg());
            return result;
        } else {
            Result result= Result.fail();
            result.setMsg("内部错误");
            return result;
        }
    }
}
