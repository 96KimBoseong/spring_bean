package com.spring_bean;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class PasswordEncoderTest {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    @DisplayName("수동등록된 passwordEncoder를 주입받아서 문자열 암호화")
    void test1(){
        String password = "Robbie's password";

        String encodePassword = passwordEncoder.encode(password);
        System.out.println(encodePassword);

        String inputPassword = "Robbie";

        boolean matches = passwordEncoder.matches(inputPassword, encodePassword);
        System.out.println(matches);
    }
}
