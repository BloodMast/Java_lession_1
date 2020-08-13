package ru.geekbrains.hw.lession_4;

public class toCallStaff {
    public static void main(String[] args) {

        Staff worker1 = new Staff("Иванов Иван Иванович", 50000, 25);
        Staff worker2 = new Staff("Петров Петр Петрович", 25000, 41);
        Staff worker3 = new Staff("Сидоров Иван Владимирович", 46000, 36);
        Staff worker4 = new Staff("Пупкин Василий Григорьевич", 67000, 51);
        Staff worker5 = new Staff("Васильев Григорий Сидорович", 80000, 47);




        Staff[] moreThanForty = {worker1, worker2, worker3, worker4, worker5};

        for (int i = 0; i < moreThanForty.length; i++)
            if (moreThanForty[i].getWorkerAge() > 40) {
                System.out.printf("Name: %s \n", moreThanForty[i].getWorkerName());
                System.out.printf("Age: %s \n", moreThanForty[i].getWorkerAge());
                System.out.printf("Tax: %s \n", moreThanForty[i].getWorkerTax());
            } else System.out.println("Too yong");

        for (int i = 0; i < moreThanForty.length; i++){
            if(moreThanForty[i].getWorkerAge() > 45) {
                System.out.print(moreThanForty[i].getWorkerName());
                System.out.println("Is up to: ");
                System.out.println(moreThanForty[i].getWorkerTax() + 5000);
            } else System.out.println("Not require");

    }

        System.out.println(worker1.getWorkerName());
        System.out.print(worker1.getWorkerAge());

 }
}
