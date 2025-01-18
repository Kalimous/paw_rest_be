package com.can.pawrest.controller;

import com.can.pawrest.dto.joinDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
public class    UserController {


    @PostMapping("/create")
    public ResponseEntity<String> createUser(@Valid @RequestBody joinDto joinDto, BindingResult result){
        if(result.hasErrors()){
            // 오류 메시지를 목록으로 반환 (좀 더 읽기 쉬운 형식으로)
            String errorMessages = result.getAllErrors().stream()
                    .map(ObjectError::getDefaultMessage)
                    .collect(Collectors.joining(", "));

            return ResponseEntity.badRequest().body("Validation failed: " + errorMessages);
        }

        return ResponseEntity.ok("User created successfully!");
    }

}
