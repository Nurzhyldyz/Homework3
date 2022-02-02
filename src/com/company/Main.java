package com.company;

public class Main {

    public static void main(String[] args) {

        double[] array = new double[15];
        array[0] = 8;
        array[1] = -2;
        array[2] = -4;
        array[3] = 2;
        array[4] = 3;
        array[5] = 6;

        double sum = 0;
        double average = 0;
        boolean isNegative = false;
        int count = 0;

        System.out.print("Array = { ");
        for (double i : array) {
            System.out.print(i + ", ");
            if (i < 0) {
                isNegative = true;
            } else if (isNegative && i > 1) {
                count++;
                sum = sum + i;
            }

        }
        average = sum / count;
        System.out.println("}");
        System.out.println("Кол-во положи-х чисел после первого отрицательного: " + count);
        System.out.println("Сумма массива положи-х чисел после первого отрицательного = " + sum);
        System.out.println("Среднее арифметическое = " + average);


        int[][] elements = new int[][]{
                {-4, -2, 2,},

                {3, 6, 8}
        };
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; i++) {
                System.out.println(elements[i][j]);


            }

        }

    }
}


