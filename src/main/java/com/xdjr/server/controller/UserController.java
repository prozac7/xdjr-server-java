package com.xdjr.server.controller;

import com.xdjr.server.domain.User;
import com.xdjr.server.service.UserService;
import com.xdjr.server.vo.Result;
import com.xdjr.server.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @description: user 控制器
 * @author: 刘子豪 2022/3/22 18:27
 * @email: liuzihao29@jd.com
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("get")
    public Result<UserVo> get(@RequestParam(name = "id") Long id) {
        User user = userService.getById(id);
        if (Objects.isNull(user)) {
            return Result.<UserVo>builder()
                    .code("404")
                    .message("Not found")
                    .build();
        }

        return Result.<UserVo>builder()
                .code("200")
                .message("success")
                .data(UserVo.builder()
                        .name(user.getName())
                        .email(user.getEmail())
                        .build())
                .build();
    }
}
