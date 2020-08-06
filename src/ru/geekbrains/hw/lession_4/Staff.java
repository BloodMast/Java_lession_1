package ru.geekbrains.hw.lession_4;

public class Staff {
   private final String name;
   private int tax;
   private final  int age;

   public Staff(String name, int tax, int age){
        this.name = name;
        this.tax = tax;
        this.age = age;
    }
    
    public String getWorkerName() {
        return this.name;
    }

    public int getWorkerTax() {
        return this.tax;
    }

    public int getWorkerAge() {
        return this.age;
    }


    }





