package ru.geekbrains.hw.lession_6;

import java.io.*;
import java.util.Scanner;

public class main {
    public  static void main(String[] args){
        InputStream in;
        OutputStream out;

        try {
            PrintStream story1 = new PrintStream(new FileOutputStream("story1.txt"));
                story1.println("OK. I’m going to talk about movies. I love movies.\nI think many, many people around the world today love movies.\nI probably see one or two movies a week on DVD in my room.");
                story1.flush();
                story1.close();
            PrintStream story2 = new PrintStream(new FileOutputStream("story2.txt"));
                story2.println("I watch the movies on my computer so I am a big, big fan of movies.\nI watch them all the time");
                story2.flush();
                story2.close();

            PrintStream story3 = new PrintStream(new FileOutputStream("story3.txt"));

            Scanner scanner1 = new Scanner(new FileInputStream("story1.txt"));
            Scanner scanner2 = new Scanner(new FileInputStream("story2.txt"));

                while (scanner1.hasNext() || scanner2.hasNext()) {
                    story3.println(scanner1.nextLine());
                    story3.println(scanner2.nextLine());
                }

                





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
