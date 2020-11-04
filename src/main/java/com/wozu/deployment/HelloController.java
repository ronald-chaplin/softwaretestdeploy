package com.wozu.deployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get")
public class HelloController {

    @GetMapping("/get")
    public String getHello(){
        return "Hello!";
    }

}
