package homework;

import static homework.MethMyforStudy.*;


public class Utils {
    public static void verifyEquals(String expectedResult, String actualResult) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(ANSI_GREEN + "PASS" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "FAIL" + ANSI_RESET);
        }
    }


    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println(ANSI_GREEN + "PASS" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "FAIL" + ANSI_RESET);
        }
    }

    public static void verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println(ANSI_GREEN + "PASS" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "FAIL" + ANSI_RESET);
        }
    }

    public static void task(int number) {
        String line = ANSI_CYAN + "_____________________" + ANSI_RESET;
        System.out.println("\n" + line);
        System.out.println(ANSI_YELLOW + "\u272B \u272B \u272B " + "Task " + number + " \u272B \u272B \u272B");
        System.out.println(line);

    }

    public static int print(String str) {
        System.out.println(str);
        return 0;
    }

    public static void print(int i) {
        System.out.println(i);
    }

    public static void print(double d) {
        System.out.println(d);
    }
    public static void print(boolean b) {
        System.out.println(b);
    }

    public static int[] checkZero(int [] arr){
        if (arr.length == 0){
            return new int[]{};
        } else {
            return arr;
        }
    }



}
