package com.xdjr.server.controller;

import com.xdjr.server.domain.User;
import com.xdjr.server.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @description: TODO
 * @author: 刘子豪 2022/3/22 18:58
 * @email: liuzihao29@jd.com
 */
@Controller
public class IndexController {

    @Resource
    private UserService userService;

    @RequestMapping("index")
    public String index(@RequestParam(name = "userId") Long userId, Model model) {
        User user = userService.getById(userId);
        if (Objects.isNull(user)) {
            model.addAttribute("errorCode", "404");
            model.addAttribute("errorMsg", "Not found");
            return "404";
        }

        model.addAttribute("user", user);
        return "index";
    }
}
