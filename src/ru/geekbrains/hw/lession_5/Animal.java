package ru.geekbrains.hw.lession_5;

import sun.awt.geom.AreaOp;

public class Animal {
    protected String name;
    protected int age;
    protected String color;

    protected Animal(String name, String color, int age){
        this.age = age;
        this.color = color;
        this.name = name;
    }

    protected int getAge() {
        return this.age;
    }
    protected String getName() {
        return this.name;
    }

    protected void run(int distance){

    }

    protected void swim(int distance){

    }

    protected void hurdle(float height){

    }

}
