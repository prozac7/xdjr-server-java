package com.xdjr.server.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: user vo
 * @author: 刘子豪 2022/3/22 18:35
 * @email: liuzihao29@jd.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVo {

    private String name;

    private String email;
}
