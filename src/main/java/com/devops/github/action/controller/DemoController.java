package com.devops.github.action.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @GetMapping("/hello")
    public String helloWord() {
        return "<h1>Hello World</h1>";
    }

    @GetMapping("/hello2")
    public String secondWord() {
        StringBuilder sb = new StringBuilder();

        if (sb != null) {
            sb.append("<h1>Hello World</h1>");
        }

        String exampleString = "NotNull";

        // This will throw a NullPointerException
        System.out.println("Length of the string: " + exampleString.length());
        return sb.toString();

    }

}