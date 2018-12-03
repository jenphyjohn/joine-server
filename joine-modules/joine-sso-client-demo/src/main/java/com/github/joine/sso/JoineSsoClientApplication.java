package com.github.joine.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * @author JenphyJohn
 * @date 2018年01月27日13:00:09
 * 单点登录客户端
 */
@EnableOAuth2Sso
@SpringBootApplication
public class JoineSsoClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoineSsoClientApplication.class, args);
    }

}
