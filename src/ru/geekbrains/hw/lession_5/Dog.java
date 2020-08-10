package ru.geekbrains.hw.lession_5;

public class Dog extends Animal {

    public Dog(String name, String color, int age){
            super(name, color, age);
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void run(int distance){
        if(distance <= 500) {
            System.out.println(this.name + " is running");
        } else System.out.println(this.name + " is so lazy to run");
    }

    @Override
    public void swim(int distance){
        if(distance <= 10) {
            System.out.println(this.name + " swimming");
        } else System.out.println(this.name + " can't swim so far");
    }


    @Override
    public void hurdle(float height){
        if(height <= 0.5) {
            System.out.println(this.name + " jump through a hurdle");
        } else System.out.println(this.name + " can't jump so height");
    }
}
