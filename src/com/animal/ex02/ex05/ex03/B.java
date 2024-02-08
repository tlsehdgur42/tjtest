package com.animal.ex02.ex05.ex03;

public class B extends OddDetector {
    public B(int n) {
        super(n);
    }

    @Override
    public boolean isOdd() {
        if (n % 2 == 1) {
            return true;
        }else{
            return false;
        }
    }
}
