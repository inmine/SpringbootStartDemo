package com.example.chaorenjob.exception;

public enum ExceptionEnum {

    USER_NOT_FOUND("10000", "用户没有找到");

    ExceptionEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
