package com.cantech.auth.auth_service.deploytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeploytestController {

    @GetMapping("/test")
    public String test() {
        return "Auth Server 입니다.";
    }
}
