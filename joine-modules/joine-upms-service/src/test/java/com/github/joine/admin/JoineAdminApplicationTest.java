package com.github.joine.admin;

import com.ulisesbocchio.jasyptspringboot.encryptor.DefaultLazyEncryptor;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.springframework.core.env.StandardEnvironment;

public class JoineAdminApplicationTest {

    private static final String JASYPT_ENCRYPTOR_PASSWORD = "jasypt.encryptor.password";

    @Test
    public void testEnvironmentProperties() {
        System.setProperty(JASYPT_ENCRYPTOR_PASSWORD, "root");
        StringEncryptor stringEncryptor = new DefaultLazyEncryptor(new StandardEnvironment());

        // 加密方法
        System.out.println(stringEncryptor.encrypt("123456"));
        // 解密方法
        System.out.println(stringEncryptor.decrypt("7uArstWJB0N28Nwa5uTdaA=="));
    }
}