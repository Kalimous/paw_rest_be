package com.can.pawrest.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class HashPasswordService{

    private final BCryptPasswordEncoder passwordEncoder;

    public HashPasswordService() {
        this.passwordEncoder = new BCryptPasswordEncoder();  // BCrypt 인스턴스 생성
    }

    public String hashPassword(String password) {
        return passwordEncoder.encode(password);  // 비밀번호 해시화
    }

    public boolean isMatch(String password, String hashedPassword) {
        return passwordEncoder.matches(password, hashedPassword);
    }
}

