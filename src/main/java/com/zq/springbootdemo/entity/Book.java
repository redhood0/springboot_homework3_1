package com.zq.springbootdemo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: zq
 * @Date: 2020/3/11 09:10
 * @Description:
 */
@Data
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "book")
public class Book {
    private String isdn;
    private String name;
    private String author;
    private Float price;
    private String desc;
}