package com.Bisan.BookShelf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloWorld {

    @GetMapping
    public String GetHelloString(){
        return "hello world";
    }
}
