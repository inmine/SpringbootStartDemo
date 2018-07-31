package com.example.chaorenjob.exception.user;

import com.example.chaorenjob.exception.CommonException;

/**
 * 用户没找到
 */
public class UserNotFoundException extends CommonException {
    public UserNotFoundException() {
        super("10000", "用户没有找到");
    }
}
