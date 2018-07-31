package com.example.chaorenjob.model;

public class Result<T> {
    private String code;
    private String msg;
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 默认不带参数的返回
     *
     * @param <T>
     * @return
     */
    public static <T> Result<T> ok() {
        return Result.ok(null);
    }

    /**
     * 默认返回对象
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> ok(T data) {
        Result<T> result = new Result<>();
        result.setCode("1");
        result.setMsg("操作成功");
        result.setData(data);
        return result;
    }

    /**
     * 带参数的返回失败
     *
     * @param <T>
     * @return
     */
    public static <T> Result<T> fail() {
        return Result.fail(null);
    }

    /**
     * 带参数的返回失败
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> fail(T data) {
        Result<T> result = new Result<>();
        result.setCode("0");
        result.setMsg("操作失败");
        result.setData(data);
        return result;
    }
}
