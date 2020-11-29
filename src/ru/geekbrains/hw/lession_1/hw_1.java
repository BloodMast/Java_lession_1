package ru.geekbrains.hw.lession_1;

public class hw_1 {
    public static float task_1(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    public static boolean task_2(int num1, int num2){
        int s = num1 + num2;
        return (s >= 10) && (s <= 20);
    }

    public  static void task_3(int number){
        if (number >=0) {
            System.out.println("Число" + ' ' + number + ' ' + "является положительным");
        } else {
            System.out.println("Число" + ' ' + number + ' ' + "является отрицательным");
        }
    }
    public  static void task_4(String name){
        System.out.println("Привет," + name + "!");
    }

    public static void main(String[] args){
        System.out.println(task_1(1, 5, 7, 4));
        System.out.println(task_2 (4, 8));
        task_3(8);
        task_4 ("Borris");
    }
}
