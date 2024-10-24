package com.devops.github.action.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


@RestController
public class DemoController {
    Logger logger = Logger.getLogger(getClass().getName());
    @GetMapping("/hello")
    public String helloWord() {
        return "<h1>Hello World</h1>";
    }

    @GetMapping("/hello2")
    public String secondWord() {
        StringBuilder sb = new StringBuilder();

        sb.append("<h1>Hello World</h1>");

        String exampleString = "NotNull";

        // This will throw a NullPointerException
        logger.info("Length of the string: " + exampleString.length());
        return sb.toString();

    }

}