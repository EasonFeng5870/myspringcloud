package com.eason;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * spring boot starter
 *
 * @author fengyingsheng
 */
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@ComponentScan(value = "com.eason.core")
public class MyspringcloudBussinessApplication {

    public static void main(String[] args) {
        normalWay(args);
//        shutdownBanner(args);
    }

    private static void shutdownBanner(String[] args) {
        SpringApplication application = new SpringApplication(MyspringcloudBussinessApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

    private static void normalWay(String[] args) {
        SpringApplication.run(MyspringcloudBussinessApplication.class, args);
    }
}
