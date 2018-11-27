package com.github.joine.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author JenphyJohn
 * @date 2017-12-29 13:02:29
 * zipkin 链路追踪
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class JoineZipkinElkApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoineZipkinElkApplication.class, args);
    }
}
