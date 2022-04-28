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
        System.out.print("| Double d = " + d + "\t|" + " Double d_1 = " + d_1 + "\t   | " + d.equals(d_1) + "  \t\t|\n");
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
        System.out.println((Arrays.toString(returnArrayDouble8(5.5, 8.4, 9.3, 40.3, 6.1))));

        task(9);//Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
        System.out.println(Arrays.toString(returnArrayString9("Каждый", "охотник", "желает", "знать", "где")));

        task(10); //Написать метод, который принимает на вход массив целых чисел, и возвращает массив тех же
        // чисел, умноженных на 2.5


    }


}
