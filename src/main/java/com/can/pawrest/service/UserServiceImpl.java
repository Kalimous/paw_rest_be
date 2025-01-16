package com.can.pawrest.service;

import com.can.pawrest.entity.User;
import com.can.pawrest.exception.DuplicateUserInfoException;
import com.can.pawrest.repository.JpaUserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final JpaUserRepository userRepository;

    public UserServiceImpl(JpaUserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void join(User user) {
    }
}
