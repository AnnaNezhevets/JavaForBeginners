package homework;

import static homework.MethMyforStudy.*;

public class HW6 {

    public static void task10(int start, int end, int step) {
        if (start < end && step > 0) {
            for (int i = start; i < end; i = i + step) {
                System.out.print(i + " ");

            }
        } else if (start > end && step < 0) {
            for (int i = start; i > end; i = i + step) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("некорректные данные");
        }

    }

    //11 Написать метод, который принимает параметр l и печатает последовательность четных чисел от нуля.
    // Длина последовательности = l.
    public static void task11(int l) {
        for (int i = 0; i < l + 1; i = i + 1) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //12 Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n
    // включительно
    public static void task12(int n){
        for(int i = 1; i <= n; i = i + 1){
            System.out.println(String.format("%2.0f", Math.pow(2,i)));
        }
    }


    public static void main(String[] args) {

        task(); //1 Распечатать последовательность чисел от 0 до 9 включительно.

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        task(); //2 Распечатать последовательность чисел от 10 исключительно до 0 включительно.

        for (int i = 9; i > -1; i--) {
            System.out.print(i + " ");
        }

        task(); //3 Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.

        for (int i = 50; i < 56; i += 2) {
            System.out.print(i + " ");
        }

        task(); //4 Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)

        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        task(); //5  Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1

        for (float i = 12; i < 13.1; i += 0.1) {
            System.out.print(i + " ");
        }

        task(); //6 Распечатать последовательность четных чисел от 215 до 237 включительно

        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        task(); //7 Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14
        // исключительно.

        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.println("нет совпадений");
            }
        }

        task(); //8 Распечатать последовательность, которая начинается с минимального значения типа данных short и
        // заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.

        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.print(i + " ");
            }
        }

        task(); //9 Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11,
        // должны быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом.
        // А ноль необходимо распечатать словом ZERO.

        for (int i = -10; i < 35; i++) {
            if (i == 0) {
                System.out.print("ZERO" + " ");
            } else if (i % 11 == 0) {
                System.out.print(ANSI_BLUE + i + " " + ANSI_RESET);

            } else if (i % 12 == 0) {
                System.out.print(ANSI_RED + i + " " + ANSI_RESET);
            }
        }

        task(); //10 Написать метод, который принимает на вход параметры start,  end, step, и печатает
        // последовательность десятичных  чисел, начиная с числа start, с шагом step. Точка выхода из цикла
        // - число end.

        task10(50, 100, 2);
        task10(500, 100, -20);
        task10(50, 100, 0);


        System.out.println(HW5.assignMin(5, 10, 20));

        task(); //11 Написать метод, который принимает параметр l и печатает последовательность четных чисел от нуля.
        // Длина последовательности = l.

        task11(12);

        task(); //12 Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n
        // включительно

        task12(8);

        task(); //13 Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
        for (int i = 1; i < 10; i++){
            System.out.print("0" + i);
        }
        for (int i = 11; i < 100; i += 11){
            if (i == 11){
                System.out.print("00");
            }
            System.out.print(i);
        }
        for (int i = 111; i < 1000; i += 111){
            if(i == 111){
                System.out.print("000");
            }
            System.out.print(i);
        }
        for (int i = 1111; i < 10000; i += 1111){
            if (i == 1111){
                System.out.print("0000");
            }
            System.out.print(i);
        }

       task(); //14 Распечатайте последовательность чисел: 0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
        for(int i = 0; i < 2; i++){
            System.out.println(i);
        }


















    }
}
