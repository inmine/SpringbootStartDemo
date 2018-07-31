package com.example.chaorenjob.exception;

public class ExceptionUtils {
    public static void isTrue(Boolean bool, CommonException e) {
        if (!bool) {
            throw e;
        }
    }
}
