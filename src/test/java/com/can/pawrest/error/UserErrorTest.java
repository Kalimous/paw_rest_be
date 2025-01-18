package com.can.pawrest.error;

import com.can.pawrest.exception.error.UserException;
import com.can.pawrest.exception.error.ErrorCode;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserErrorTest {

    private static final Logger log = LoggerFactory.getLogger(UserErrorTest.class);

    @Test
    public void test() {
        throw new UserException(ErrorCode.USER_NOT_FOUND);
    }
}
