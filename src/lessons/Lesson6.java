package lessons;

import jdk.swing.interop.SwingInterOpUtils;

public class Lesson6 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Java for beginners");
        }

        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        for (int i = 1; i < 11; i = i + 2) {
            System.out.println(i);
        }

        for (int i = 1; i < 101; i += 10) {
            System.out.println(i);
        }

        for (int i = 0; i < 101; i += 10) {
            System.out.println(i);
        }

        for (int i = -100; i < 101; i += 10) {
            System.out.println(i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("_________________________________________________");

        String bottles = " bottles of beer";
        String bottle = " bottle of beer";
        String wall = " on the wall";
        String take = "Take one down and pass it around";
        String commaSpace = ", ";
        String dot = ".";
        String go = "Go to the store and buy some more";
        String noMoreC = "No more";
        String noMoreL = "no more";
        String ln = "\n";

        for (int i = 99; i > -1; i--) {
            if(i == 2) {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottle + wall + dot + ln);
            } else if(i == 1) {
                System.out.println(i + bottle + wall + commaSpace + i + bottle + dot);
                System.out.println(take + commaSpace + noMoreL + bottles + wall + dot + ln);
            } else if(i == 0) {
                System.out.println(noMoreC + bottles + wall + commaSpace + noMoreL + bottles + dot);
                System.out.println(go + commaSpace + (i + 99) + bottles + wall + dot);
            } else {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot + ln);

            }

        }


    }
}
