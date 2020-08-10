package ru.geekbrains.hw.lession_5;

public class main {

    public  static void main(String[] args) {

        Cat cat1 = new Cat("Fedor", "black", 7);
        Dog dog1 = new Dog("Sharik", "white", 9);
        Dog dog2 = new Dog("Tuzik", "red", 11);
        Dog dog3 = new Dog("Polkan", "black", 7);

        Animal[] competition = {dog1, dog2, dog3};

        for(int i = 0; i < competition.length; i++) {
            if(competition[i].getAge() < 10) {
                System.out.println(competition[i].getName() + " is running");
            } else System.out.println(competition[i].getName() + " is too old to run");
        }

           cat1.run(150);
           cat1.swim(1);
           dog1.run (600);
           dog1.swim(5);
           cat1.hurdle(1.5F);
           dog1.hurdle(0.6F);


    }
}
