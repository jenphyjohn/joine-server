
package com.github.joine.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author JenphyJohn
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class JoineConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoineConfigApplication.class, args);
    }
}
