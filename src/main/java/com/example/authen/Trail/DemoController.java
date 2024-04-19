package com.example.authen.Trail;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/trial")
public class DemoController {

    @GetMapping("/demo")
    public ResponseEntity<String> HelloWorld(){
        return ResponseEntity.ok("Java Security Implementation with JWT");
    }
}
