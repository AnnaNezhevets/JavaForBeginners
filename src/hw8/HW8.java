package hw8;

import java.io.ObjectInput;
import java.util.Arrays;

import static homework.Utils.*;
import static hw8.HW8_1.*;

public class HW8 {

    public static void main(String[] args) {

        task(5);
        Integer i = new Integer(6);
        Double d = new Double(7.5);
        String str = new String("text");

        task(6);
        printLine();
        System.out.print("| HW8\t\t\t\t| HW8_1\t\t\t\t   | areEquals? |\n");
        printLine();
        System.out.print("| Double d = " + d + "\t|" + " Double d_1 = " + d_1 + "\t   | " + d.equals(d_1)
                + "  \t\t|\n");
        printLine();
        System.out.print("| String str = " + str + "\t|" + " String str_1 = " + str_1 + "  | " + str.equals(str_1)
                + "  \t\t|\n");
        printLine();
        System.out.print("| Integer i = " + i + "\t\t|" + " Integer i_1 = " + i_1 + "\t   | " + i.equals(i_1)
                + "  \t\t|\n");
        printLine();

        task(7); //Написать метод, который принимает на вход 5 целых чисел, и возвращает массив из этих же чисел
        System.out.println(Arrays.toString(returnArrayInt7(6, 5, 67, 56, 7)));

        task(8); //Написать метод, который принимает на вход 5 чисел типа double, и возвращает массив из этих же
        // чисел
        print((Arrays.toString(returnArrayDouble8(5.5, 8.4, 9.3, 40.3, 6.1))));

        task(9);//Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
        print(Arrays.toString(returnArrayString9("Каждый", "охотник", "желает", "знать", "где")));

        task(10); //Написать метод, который принимает на вход массив целых чисел, и возвращает массив тех же
        // чисел, умноженных на 2.5
        int[] arr8 = {7, 5, 7, 3 ,9, 8};
        print(Arrays.toString(arrayMulty(arr8)));

        task(11); //Task11 Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает количество четных чисел в этом массиве
        int [] array = {1, 2, 2, 5, 6,8, 8, 10};
        print(returnDigitalWithEven(array));

        task(12); //Task12 Написать метод, который принимает на вход массив целых положительных чисел, и
        // возвращает массив нечетных чисел
        int [] array12 = {1, 3, 2, 5, 6, 3, 8, 10};
        print(Arrays.toString(returnArrayOddDigital(array12)));

        task(13); //Task13 Написать метод, который принимает на вход массив целых чисел, и возвращает
        // массив значений true или false, если числа больше 10
        int [] array13 = {1, 45, 2, 557, 6, 56, 8, 10};
        print(Arrays.toString(returnTrueOrFalse(array13)));





















    }

}
