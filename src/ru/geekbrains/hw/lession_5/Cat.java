package ru.geekbrains.hw.lession_5;

public class Cat extends Animal {

    public Cat(String name, String color, int age){
        super(name, color, age);
    }

    @Override
    public void run(int distance){
        if(distance <= 200) {
            System.out.println(this.name + " is running");
        } else System.out.println(this.name + "is so lazy to run");

    }

    @Override
    public void swim(int distance){
        System.out.println(this.name + " is afraid to swim");
    }

    @Override
    public void hurdle(float height){
        if((int)height <= 2) {
            System.out.println(this.name + " jump through a hurdle");
        } else System.out.println(this.name + " can't jump so height");
    }

}
