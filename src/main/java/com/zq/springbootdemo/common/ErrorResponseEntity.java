package com.zq.springbootdemo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zq
 * @Date: 2020/3/26 08:36
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponseEntity {
    private int code;
    private String message;
}