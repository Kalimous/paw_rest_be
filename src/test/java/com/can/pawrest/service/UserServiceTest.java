package com.can.pawrest.service;

import com.can.pawrest.entity.User;
import com.can.pawrest.role.Role;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class UserServiceTest {

    private final UserService userService;

    @Autowired
    public UserServiceTest(UserService userService) {
        this.userService = userService;
    }

    @Test
    public void joinTest() {
        User user = new User();
        user.setUserId("userId");
        user.setUsername("username");
        user.setPassword("password");
        user.setPhone_number("010-8370-1347");
        userService.join(user);
    }


    @Test
    public void findByUsernameTest() {
        Optional<User> user = userService.findByUsername("test");

        Assertions.assertThat(user.isPresent()).isTrue();
    }
}
