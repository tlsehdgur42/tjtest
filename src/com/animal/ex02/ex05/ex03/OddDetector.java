package com.animal.ex02.ex05.ex03;

abstract class OddDetector {

    protected int n;

    public OddDetector(int n) {
        this.n = n;
    }

    public abstract boolean isOdd();
}

class Main {
    public static void main(String[] args) {
        B b = new B(10);
        System.out.println(b.isOdd());
    }
}