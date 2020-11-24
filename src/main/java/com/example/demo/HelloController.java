package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {
@RequestMapping("/hello")
public List<String> hello(){
    return Arrays.asList("Steve Smith","Mohamad","Hafeez",
            "Jon Dow","Andrew","Ed Malik");
}
}
