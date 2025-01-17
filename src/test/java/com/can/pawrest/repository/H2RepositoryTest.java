package com.can.pawrest.repository;

import com.can.pawrest.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
public class H2RepositoryTest {

    private final UserRepository repository;

    @Autowired
    public H2RepositoryTest(UserRepository repository) {
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