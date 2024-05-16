package com.example.kafkaconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class FeignClientReaderController {
    @GetMapping("/name")
    public String getDataFromProjectB() {
        return "Data from Project B";
    }
}

