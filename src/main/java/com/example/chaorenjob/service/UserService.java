package com.example.chaorenjob.service;

import com.example.chaorenjob.dao.UserRepository;
import com.example.chaorenjob.entity.UserEntity;
import com.example.chaorenjob.exception.CommonException;
import com.example.chaorenjob.exception.ExceptionEnum;
import com.example.chaorenjob.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    /**
     * 用户登录
     *
     * @param userName
     * @param password
     */
    public void login(String userName, String password) {
        UserEntity userEntity = userRepository.findByUserNameAndPassword(userName, password);
        ExceptionUtils.isTrue(userEntity != null, CommonException.builder(ExceptionEnum.USER_NOT_FOUND));
    }
}
