package com.xdjr.server.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @description: user 数据库映射
 * @author: 刘子豪 2022/3/22 18:27
 * @email: liuzihao29@jd.com
 */
@Entity(name = "users")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "email", nullable = false)
    private String email;
}
