package com.animal.ex02.ex05.ex01;

import javax.swing.plaf.SliderUI;
import java.io.InputStream;
//import java.io.IOException;

public class MineralCalculator {
    int value = 0;

    public void add(Minerals minerals) {
        this.value += minerals.getValue();
    }
    public int getValue() {
        return value;
    }

}

class Sample {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());

    }
}
