package com.example.chaorenjob.controller;

import com.example.chaorenjob.model.Result;
import com.example.chaorenjob.model.ao.LoginAo;
import com.example.chaorenjob.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody LoginAo loginAo) {
        // 验证字段
        Assert.hasText(loginAo.getLoginName(), "用户名不能为空");
        Assert.hasText(loginAo.getPassword(), "密码不能为空");

        userService.login(loginAo.getLoginName(), loginAo.getPassword());
        return Result.ok();
    }
}
