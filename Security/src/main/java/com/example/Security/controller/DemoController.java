package com.example.Security.controller;

import com.example.Security.auth.AuthenticationRequest;
import com.example.Security.auth.AuthenticationResponse;
import com.example.Security.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class DemoController {

    private AuthenticationService authenticationService;

    @GetMapping("/test")
    public ResponseEntity<String> login(){
        return ResponseEntity.ok("Authentication and Authorization is successed!");
    }
}
