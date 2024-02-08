package com.animal.ex02.ex05.ex03;

public class Shape {
    public void draw() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    public void point() {
        super.draw();
    }

    public void draw() {
        System.out.println("Circle");
    }
}

class Main2 {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        Circle Shape = (Circle) shape;
        ((Circle) shape).point();
    }
}
