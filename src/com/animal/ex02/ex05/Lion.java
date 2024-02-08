package com.animal.ex02.ex05;

public class Lion extends Animal implements Predator {
    @Override
    public String getFood() {
        return "banana";
    }
}
