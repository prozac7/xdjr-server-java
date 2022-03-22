package com.xdjr.server.service;

import com.xdjr.server.domain.User;
import com.xdjr.server.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @description: user 业务层
 * @author: 刘子豪 2022/3/22 18:31
 * @email: liuzihao29@jd.com
 */
@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public User getById(long id) {
        Optional<User> userOpt = userRepository.findById(id);
        return userOpt.orElse(null);
    }
}
