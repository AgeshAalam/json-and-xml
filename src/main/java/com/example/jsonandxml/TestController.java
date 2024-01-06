package com.example.jsonandxml;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;


@RestController
public class TestController {

    @GetMapping("/api/test")
    public LocalDate getTime(){
        return LocalDate.now();
    }

}
