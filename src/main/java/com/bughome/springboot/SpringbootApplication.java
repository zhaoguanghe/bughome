package com.bughome.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication 来标注一个主程序类，说明这是一个SpringBoot应用
@SpringBootApplication
public class SpringbootApplication {
    //@SpringBootApplication标注的类为SpringBoot的主配置类，运行该类main方法来启动SpringBoot应用

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
