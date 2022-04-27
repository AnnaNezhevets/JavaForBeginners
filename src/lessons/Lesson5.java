package lessons;

public class Lesson5 {

    public class MethMyforStudy {
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_BLACK = "\u001B[30m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_WHITE = "\u001B[37m";

    }

    public static int returnMinOfThree(int a, int b, int c) {
        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min < c) {

            return min;
        } else {
            min = c;

            return min;
        }
    }

    public static double average(int a, int b, int c) {

        return ((double) a + b + c) / 3;
    }

    public static double returnAbs(double number) {
        if (number < 0) {
            number = (-1) * number;
        }
        return number;
    }

    public static double countDifferenceBetweenMinAndAverage(int a, int b, int c) {
        double min = returnMinOfThree(a, b, c);
        double average = average(a, b, c);

        return returnAbs(min - average);
    }


    public static String showDisplay(int a, int b, int c) {
        String message;

        if (countDifferenceBetweenMinAndAverage(a, b, c) > 3.51) {
            message = "Большой разброс чисел";
            System.out.println(message);
        } else {
            message = "Маленький разброс чисел";
            System.out.println(message);
        }
        return message;

    }

    //ДЗ 3

    public static void main(String[] args) {

        // Даны 3 числа.
        // Необходимо найти максимально точную разницу
        // между минимальным числом и средним значением.
        // Если разница больше 3.51,
        // показать пользователю сообщение "Большой разброс чисел",
        // иначе показать сообщение "Маленький разброс чисел"

        int a = 0;
        int b = 0;
        int c = 0;

        showDisplay(a, b, c);


    }

}
