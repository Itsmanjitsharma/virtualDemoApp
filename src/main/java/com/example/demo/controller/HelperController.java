package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelperController {
       @GetMapping("/api/printName/{name}")
       public String getName(@PathVariable("name") String name){
            return "Hello "+name;
       }
}
