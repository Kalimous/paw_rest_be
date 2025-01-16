package com.can.pawrest.repository;

import com.can.pawrest.entity.User;

import java.util.Optional;

public class H2UserRepository implements UserRepository {

    @Override
    public void save(User user) {

    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.empty();
    }
}
