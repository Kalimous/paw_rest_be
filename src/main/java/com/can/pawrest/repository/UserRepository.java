package com.can.pawrest.repository;

import com.can.pawrest.entity.User;

import java.util.Optional;

public interface UserRepository {
    public void save(User user);
    public Optional<User> findByUsername(String username);
}
