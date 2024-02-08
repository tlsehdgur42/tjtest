package com.ex02.ex05;

public class HouseDog extends Dog {
    public HouseDog(String name) {
        this.setName(name);
    }
    HouseDog(int type) {

        if (type == 1) {

            this.setName("yorkshire");

        } else if (type == 2) {

            this.setName("bulldog");

        }
    }
}
