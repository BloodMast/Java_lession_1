package ru.geekbrains.hw.lession_2;

import java.util.Arrays;

public class hw_2 {



        public static void main(String args[]){

        int[] replace = {1, 0, 1, 1, 0, 0};
        task_1(replace);

        int fill[] = new int[8];
        task_2(fill);

        int[] multiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task_3 (multiplication);

        int[] extreme_value = {4, 12, 7, 1, 3, 24, 5};
        task_4(extreme_value);
        task_4_1(extreme_value);

        int diagonal_fill[][] = new int[5][5];
        task_5(diagonal_fill);

        }
        private static void task_1(int[] a) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 0){
                   a[i] = 1;
                } else a[i] = 0;
                System.out.println(a[i]);
            }
        }
        private static void task_2(int[] b){
            b[0] = 1;
            for (int i = 1; i <b.length; i++) {
                b[i] = b[i - 1] + 3;
                System.out.println(b[i]);
            }


        }
        private static void task_3(int[] c){
            for (int i = 0; i < c.length; i++){
                if (c[i] <6) {
                    c[i] = c[i] * 2;
                }
                System.out.println(c[i]);

                }
            }
        private static void task_4(int[] d){
            int max_value = d[0];
            for (int i : d)
                if (i > max_value) max_value = i;

            System.out.println(max_value);
        }
        private static void task_4_1(int[] e){
            int min_value = e[0];
            for (int i : e)
                if (i < min_value) min_value = i;
            System.out.println(min_value);
        }
        private static void task_5(int[][] f){
            for (int i = 0, g = 0; i < f.length && g < f.length; i++, g++){
                f[i][g] = 1;
                System.out.printf("%3d", f[i][g]);
            }
        }

    }

