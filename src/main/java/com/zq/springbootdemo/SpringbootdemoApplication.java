package com.zq.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zq
 */
@SpringBootApplication
//强制使用cglib代理
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
//        new SpringApplicationBuilder(SpringbootdemoApplication.class)
//                .bannerMode(Banner.Mode.OFF).run(args);
    }

}
