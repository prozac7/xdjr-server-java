package com.xdjr.server.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 页面返回结构
 * @author: 刘子豪 2022/3/22 18:34
 * @email: liuzihao29@jd.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result<T> {

    private String code;

    private String message;

    private T data;
}
