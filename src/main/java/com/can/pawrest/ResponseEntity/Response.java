package com.can.pawrest.ResponseEntity;

import lombok.Builder;
import lombok.Data;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Response {

    private String message;
    private List<String> errors;

    public Response(String message, List<String> errors){
        this.message = message;
        this.errors = errors;
    }

    public Response(String message){
        this.message = message;
    }

    // 성공 응답
    public static HashMap<String, Object> success(String message) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("message", message);
        return map;
    }

    // 실패 응답
//    public static HashMap<String, Object> error(String message, List<String> errors) {
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("message", message);
//        map.put("errors", errors);
//        return map;
//    }
//
//    public static HashMap<String, Object> error(String message) {
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("message", message);
//        return map;
//    }


}

