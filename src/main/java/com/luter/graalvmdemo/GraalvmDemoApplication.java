package com.luter.graalvmdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//这里proxyBeanMethods方法代理关闭
@SpringBootApplication(proxyBeanMethods = false)
public class GraalvmDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraalvmDemoApplication.class, args);
    }

}
