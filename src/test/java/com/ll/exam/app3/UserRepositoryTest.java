package com.ll.exam.app3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private SiteUserRepository siteUserRepository;

    @Test
    @DisplayName("회원 생성")
    void createNewUserTest() {
        SiteUser newUser1 = SiteUser.builder()
                .id(null)
                .username("user1")
                .password("{noop}1234")
                .build();

        SiteUser newUser2 = SiteUser.builder()
                .id(null)
                .username("user2")
                .password("{noop}1234")
                .build();

        siteUserRepository.saveAll(Arrays.asList(newUser1, newUser2));
    }
}