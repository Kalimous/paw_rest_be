package com.can.pawrest.repository;

import com.can.pawrest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface H2UserRepository extends JpaRepository<User, Integer> {

}
