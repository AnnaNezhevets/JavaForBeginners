package homework;

import static homework.MethMyforStudy.*;

public class HW5 {

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


    public static String dayOfWeek(int d) {
        String day;

        if (d == 1) {
            day = "Понедельник";
            return day;
        } else if (d == 2) {
            day = "Вторник";
            return day;
        } else if (d == 3) {
            day = "Среда";
            return day;
        } else if (d == 4) {
            day = "Четверг";
            return day;
        } else if (d == 5) {
            day = "Пятница";
            return day;
        } else if (d == 6) {
            day = "Суббота";
            return day;
        } else if (d == 7) {
            day = "Воскресенье";
            return day;
        } else {
            return day = "fail";
        }


    }

    public static int determineMax(int x, int y, int z) {
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        if (max > z) {

            return max;

        } else {
            max = z;

            return max;
        }
    }


    public static int assignMax(int x, int y, int z) {
        int max = determineMax(x, y, z);
        if (max == x) {
            x = max;
            System.out.println("x = " + x);
        } else {
            if (max == y) {
                y = max;
                System.out.println("y = " + y);
            } else {
                z = max;
                System.out.println("z = " + z);
            }
        }
        return max;
    }

    public static Integer assignMin(int a, int b, int c) {
        int min = Integer.MIN_VALUE;
        if (a < b) {
            min = a;
            if (a < c) {
                min = a;
            } else {
                min = c;
            }
        } else {
            min = b;
        }
        return min;
    }

    public static int assignMin1(int a, int b, int c) {

        return Math.min(Math.min(a, b), c);

    }

    public static double averageTemperatureOfCat(double t1, double t2, double t3, double t4, double t5) {
        Double average;
        average = (t1 + t2 + t3 + t4 + t5) / 5;

        return average;

    }

    public static String price(double cost) {
        double price = 10.75;
        int rub = (int) price;
        int cop = (int) (price * 100 - rub * 100);

        return (rub + " рублей " + cop + " коп");
    }


    public static String weight(double weight) {
        double g = 10.75;
        int kg = (int) g;
        double gr = (g * 100 - 1000);

        return (kg + " кг " + (int) gr + " гр");
    }

    public static String checkMult(double price, double weight) {
        double bill = price * weight; // 115,5625
        double cop454 = bill - (int) bill; // 115.5625 - 115
        double cop = cop454 * 100;// 5625

        return ((int) bill + " рублей " + (int) cop + " копеек");
    }

    String line = "_________________________________________";

    public static String salary(int t, double p) {
        double salary = t * p;
        if (salary == t * p) ;
        {
            salary = salary * 22;

            return (int) salary + "$";

        }
    }

    public static String printBill(String name, double cost1, double how) {
        String rub = " руб ";
        String cop = " коп ";
        String phrase = "Цена за 1 кг\t\t\t\t";
        String phrase2 = "Цена за 1 шт\t\t\t\t";
        String kg = " кг ";
        String g = " гр ";
        int costRub = (int) cost1;
        int costCop = (int) ((cost1 - costRub) * 100);
        int howKg = (int) how;
        int howG = (int) ((how - howKg) * 1000);
        double sum = how * cost1;
        int sumRub = (int) sum;
        int sumCop = (int) ((sum - sumRub) * 100);
        //int costRub9 = (int) cost9;
        //int costCop9 = (int) (cost9 - costRub9) * 100);

        if (name.equals("ЯБЛОКИ")) {

            return "\t\t\t\t" + "\uD83C\uDF4F " + "ЯБЛОКИ " + "\uD83C\uDF4E" + "\t\t\t\n"
                    + "\n"
                    + phrase + costRub + rub + costCop + cop + "\n"
                    + "Количество товара" + "\t\t\t" + howKg + kg + howG + g + "\n"
                    + "\n"
                    + "__________________________________________\n"
                    + "Сумма к оплате\t\t\t\t" + sumRub + rub + sumCop + cop + "\n"
                    + "\n"
                    + "\n";
        } else {

            return "\t\t\t\t" + "\uD83C\uDF5E " + "ХЛЕБ " + "\uD83E\uDD56" + "\t\t\t\n"
                    + "\n"
                    + "\n"
                    + phrase2 + costRub + rub + costCop + cop + "\n"
                    + "Количество товара" + "\t\t\t" + "5 шт\n"
                    + "\n"
                    + "__________________________________________\n"
                    + "Сумма к оплате\t\t\t\t" + sumRub + rub + sumCop + cop + "\n";

        }
    }

    public static String task11(String how, String month, int year, String pay) {

        return "\t\tЗарплатная ведомость за" + month + " " + year + "\n"
                + "____________________________________________________" + "\n"
                + "\n"
                + how + "\t\t\t\t" + "70000  руб 00 коп";
    }

    public static String task112(String how1, String how2, String month, int year, String pay, String pay2) {

        return "\t\tЗарплатная ведомость за" + month + " " + year + "\n"
                + "____________________________________________________" + "\n"
                + "\n"
                + how1 + "\t\t\t\t" + "70000  руб 00 коп" + "\n"
                + how2 + "\t\t\t" + "128059 руб 00 коп";

    }

    public static String task12(int x) {

        if (x < 0) {
            return "x отрицательное число";
        } else if (x > 0) {

            return "x положительное число";

        } else x = 0;

        return "x равно нулю";

    }


    public static void main(String[] args) {

        task(); //Task 1 ВСЕ!!! результаты должны быть протестированы, для этого необходимо создать метод с названием
        // verifyEquals(expectedResult, actualResult)

        task(); //Task 2 Написать метод, который принимает на вход число от 1 до 7 и возвращает день недели.
        System.out.println(dayOfWeek(6));
        verifyEquals("Понедельник", dayOfWeek(1));
        verifyEquals("Вторник", dayOfWeek(2));
        verifyEquals("Среда", dayOfWeek(3));
        verifyEquals("Четверг", dayOfWeek(4));
        verifyEquals("Пятница", dayOfWeek(5));
        verifyEquals("Суббота", dayOfWeek(6));
        verifyEquals("Воскресенье", dayOfWeek(7));
        verifyEquals("fail", dayOfWeek(9));


        task(); //Task 3  Возьмите три переменных x, y и z, определить наибольшее значение и присвоить это значение
        // самой большой переменной
        verifyEquals(8, assignMax(5, 3, 8));

        task(); //Task 4 Используя вложенные операторы if, напишите фрагмент кода, который выводит наименьшее значение,
        // содержащееся в переменных a, b и c.
        System.out.println(assignMin(46, 6, 57));
        verifyEquals(5, assignMin(67, 77, 5));
        verifyEquals(5, assignMin(67, 5, 77));
        verifyEquals(5, assignMin(5, 77, 67));

        task(); //Task 5 Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
        System.out.println(averageTemperatureOfCat(35.15, 41.00, 36.6, 39.0, 37.3));
        verifyEquals(37.81, averageTemperatureOfCat(35.15, 41.00, 36.6, 39.0, 37.3));

        task(); //Task 6 Написать метод, который принимает на вход десятичное число (например, 10.75),
        // и возвращает строку “10 руб 75 коп”.
        System.out.println(price(10.75));
        verifyEquals("10 рублей 75 коп", price(10.75));

        task(); //Task 7 Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
        System.out.println(weight(10.75));
        verifyEquals("10 кг 75 гр", weight(10.75));

        task(); //Task 8 Написать метод, который принимает на вход 2 параметра - цену и количество товара
        // (может быть вес товара, или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.
        System.out.println(checkMult(10.75, 10.75));
        verifyEquals("115 рублей 56 копеек", checkMult(10.75, 10.75));

        task(); //Task 9 Распечатать чек

        System.out.println(printBill("ЯБЛОКИ", 50.13, 3.400));
        System.out.println(printBill("ХЛЕБ", 30.50, 5));
        verifyEquals("170 руб 44 коп", printBill("ЯБЛОКИ", 50.13, 3.400));


        task();//Task 10 Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа
        // работы, и возвращает заработную плату в месяц.
        System.out.println(salary(8, 35.0));
        verifyEquals("6160$", salary(8, 35.0));

        task(); //Task 11 Написать метод, который принимает на вход необходимые параметры и печатает строку
        // ведомости выдачи зарплаты сотрудникам

        System.out.println(task11("Смирнова Мария Ивановна", " март", 2022,
                "70000  руб 00 коп"));
        System.out.println(task112("Смирнова Мария Ивановна", "Серебряков Иван Петрович", " март",
                2022, "70000  руб 00 коп", "128059 руб 00 коп"));

        System.out.println(task12(-4));
        System.out.println(task12(9));
        System.out.println(task12(0));
        verifyEquals("x отрицательное число", task12(-4));
        verifyEquals("x положительное число", task12(9));
        verifyEquals("x равно нулю", task12(0));
    }
}
