package com.can.pawrest.repository;

import com.can.pawrest.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest {

    private final UserRepository repository;

    @Autowired
    public UserRepositoryTest(UserRepository repository) {
        this.repository = repository;
    }

    @Test
    public void saveTest() {
        User user = new User();
        user.setUserId("test");
        user.setUsername("test");
        user.setPassword("test");
        repository.save(user);
    }
}
//jdbc:h2:~/test