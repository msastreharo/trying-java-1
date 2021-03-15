package com.example.demo.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzTest {

    @Test
    public void fizzbuzzReturnsSameNumberByDefault() {
        FizzBuzz fizzbuzz = new FizzBuzz();

        String result = fizzbuzz.checkForNumber(2);

        assert(result.equals("2"));
    }

    @Test
    void returnFizzIfNumberIsDivisibleByFive() {
        FizzBuzz fizzbuzz = new FizzBuzz();

        String result = fizzbuzz.checkForNumber(5);

        assert(result.equals("Fizz!"));
    }

    @Test
    void returnBuzzIfNumberIsDivisibleBySeven() {
        FizzBuzz fizzbuzz = new FizzBuzz();

        String result = fizzbuzz.checkForNumber(7);

        assert(result.equals("Buzz!"));
    }

    @Test
    void returnFizzBuzzifNumberIsDivisibleByFiveAndSeven() {
        FizzBuzz fizzbuzz = new FizzBuzz();

        String result = fizzbuzz.checkForNumber(70);

        assertThat(result, is("FizzBuzz!"));
    }
}


