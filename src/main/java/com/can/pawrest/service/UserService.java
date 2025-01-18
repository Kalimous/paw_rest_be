package com.can.pawrest.service;

import com.can.pawrest.entity.User;

import java.util.Optional;

public interface UserService {
    void join(User user);
    Optional<User> findByUsername(String username);
    Optional<User> findByUserId(String userId);
}
