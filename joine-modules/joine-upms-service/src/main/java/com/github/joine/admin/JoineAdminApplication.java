package com.github.joine.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author JenphyJohn
 * @date 2017年10月27日13:59:05
 */
@EnableAsync
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.github.joine.admin", "com.github.joine.common.bean"})
public class JoineAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(JoineAdminApplication.class, args);
    }
}