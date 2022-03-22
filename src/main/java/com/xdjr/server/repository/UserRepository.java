package com.xdjr.server.repository;

import com.xdjr.server.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @description: user 数据库层
 * @author: 刘子豪 2022/3/22 18:30
 * @email: liuzihao29@jd.com
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
