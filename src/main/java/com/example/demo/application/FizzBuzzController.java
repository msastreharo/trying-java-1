package com.example.demo.application;

import com.example.demo.domain.FizzBuzz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {
    @GetMapping("/fizzbuzz")
    public String answer(@RequestParam int number) {
        FizzBuzz fizzbuzz = new FizzBuzz();
        return fizzbuzz.checkForNumber(number);
    }
}
