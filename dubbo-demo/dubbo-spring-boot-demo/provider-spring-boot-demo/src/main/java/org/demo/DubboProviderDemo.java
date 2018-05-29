package org.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.concurrent.TimeUnit;

/**
 * startup
 * @create 2018-05-26 下午11:40
 **/
@SpringBootApplication
public class DubboProviderDemo {

    public static void main(String[] args) throws InterruptedException {

        new SpringApplicationBuilder(DubboProviderDemo.class)
                // 非 Web 应用
                .web(false)
                .run(args);
    }
}
