package com.github.joine.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author JenphyJohn
 * @date 2018-01-24
 * zipkin mysql 存储实现
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class JoineZipkinDbApplication {
    public static void main(String[] args) {
        SpringApplication.run(JoineZipkinDbApplication.class, args);
    }
}
