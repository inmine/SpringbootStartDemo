package com.example.chaorenjob.exception;

public class CommonException extends RuntimeException {
    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CommonException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CommonException(ExceptionEnum exceptionEnum) {
        this.code = exceptionEnum.getCode();
        this.msg = exceptionEnum.getMsg();
    }

    public static CommonException builder(ExceptionEnum exceptionEnum) {
        return new CommonException(exceptionEnum);
    }
}
