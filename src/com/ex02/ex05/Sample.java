package com.ex02.ex05;

public class Sample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();

        Animal dog1 = new Dog();
        dog1.setName("피피");
        System.out.println(dog1.name);

        HouseDog happy = new HouseDog("happy");

        HouseDog yorkshire = new HouseDog(1);

        System.out.println(happy.name); // happy 출력

        System.out.println(yorkshire.name); // yorkshire 출력
    }
}
