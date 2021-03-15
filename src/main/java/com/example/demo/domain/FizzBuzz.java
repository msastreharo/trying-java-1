package com.example.demo.domain;

public class FizzBuzz {
    public String checkForNumber(int number) {
        if(isDivisibleBy5(number) && isDivisibleBy7(number)) {
            return "FizzBuzz!";
        }
        if (isDivisibleBy5(number)) {
            return "Fizz!";
        }
        if (isDivisibleBy7(number)) {
            return "Buzz!";
        }

        return String.valueOf(number);
    }

    private boolean isDivisibleBy7(int number) {
        return number % 7 == 0;
    }

    private boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}
