package homework;

import com.sun.jdi.DoubleValue;

public class HW3 {

    public static void main(String[] args) {

        String Line = "____________________________________";

        /** Переменая типа byte Task 2 */

        System.out.println("_______________Task 2_______________");

        byte a;
        byte b;
        a = 120;
        b = -120;
        System.out.println(a);
        System.out.println(b);

        /** Переменная типа short с разницей в значении 60000 */

        System.out.println("_______________Task 3_______________");

        short s;
        short t;
        s = 30000;
        t = -30000;
        System.out.println("s - t " + "= " + (s - t) + ";");

        /** Переменная типа int минимально возможного значения */

        System.out.println("_______________Task 4_______________");

        int i;
        i = Integer.MIN_VALUE;
        System.out.println(Line);
        System.out.println("|   imax:    |   " + i + "       |");
        System.out.println(Line);
        i = Integer.MAX_VALUE;
        System.out.println("|   imin:    |   " + i + "        |");
        System.out.println(Line);

        /** Переменная типа long значение phoneNumber */

        System.out.println("_______________Task 5_______________");
        long phoneNumber;
        phoneNumber = 839151556677L;
        System.out.println(phoneNumber);

        /** Переменная типа float */

        System.out.println("_______________Task 6_______________");
        float f;
        f = 100.101101F;
        double d;
        d = 100.101101;
        Double dd;
        dd = 10.09999 + 20.099999;
        System.out.println(dd);
        Float ff;
        ff = 10.09999F + 20.099999F;
        System.out.println(ff);
        System.out.println(Line + "___________");
        System.out.println("|float f = 100.101101:  | " + f + "          |");
        System.out.println(Line + "___________");
        System.out.println("|double d = 100.101101: | " + d + "          |");
        System.out.println(Line + "___________");
        System.out.println("|Double dd:             | " + dd + "  |");
        System.out.println(Line + "___________");
        System.out.println("|Float ff:              | " + dd + "  |");
        System.out.println(Line + "___________");

        /** Переменная типа Double */

        System.out.println("_______________Task 7_______________");
        System.out.println("a)");
        System.out.println(dd);
        System.out.println(ff);

        /** Переменная result */

        System.out.println("_______________Task 8_______________");
        Double Result;
        Result = 10.0 / 3.0;
        System.out.println(Result);

        /** Переменная sum, product, quotient и remainder */

        System.out.println("_______________Task 9_______________");
        double sum, product, quotient, remainder;
        sum = f + d;
        product = f * d;
        quotient = f / d;
        remainder = f % d;
        System.out.println("sum = " + sum);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
        System.out.println("remainder = " + remainder);

        /** Распечатать слово HELLO точками */

        System.out.println("_______________Task 10_______________");

        System.out.println(".   . ..... .     .      ......");
        System.out.println(".   . .     .     .      .    . ");
        System.out.println("..... ....  .     .      .    . ");
        System.out.println(".   . .     .     .      .    . ");
        System.out.println(".   . .     .     .      .    . ");
        System.out.println(".   . ..... ..... .....  ......");

        /** Создать переменные соответствующие по типам данных */

        System.out.println("_______________Task 11_______________");

        byte t1, t3;
        t1 = 0;
        t3 = -120;
        short t2, t9;
        t2 = 150;
        t9 = 1010;
        int t5;
        t5 = 100100;
        long t6;
        t6 = 100010001000L;
        float t4;
        t4 = -505.505F;
        double t7, t8;
        t7 = 2.66666666666666;
        t8 = -1000000.001;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);
        System.out.println(t9);

        /** С помощью полей классов ссылочного типа распечатать таблицу */

        System.out.println("_______________Task 12_______________");

        System.out.println(Line + "___________________________________");
        System.out.println("|Type:  | Size in bits:  | min                  | max                 |");
        System.out.println(Line + "___________________________________");
        System.out.println(Byte.TYPE + ":   | " + Byte.SIZE + "              |" + Byte.MIN_VALUE
                + "                  | " + Byte.MAX_VALUE + "                 |");
        System.out.println(Line + "___________________________________");
        System.out.println(Short.TYPE + ":  | " + Short.SIZE + "             |" + Short.MIN_VALUE + "                | "
                + Short.MAX_VALUE + "               |");
        System.out.println(Line + "___________________________________");
        System.out.println(Integer.TYPE + ":    | " + Integer.SIZE + "             |" + Integer.MIN_VALUE
                + "           | " + Integer.MAX_VALUE + "          |");
        System.out.println(Line + "___________________________________");
        System.out.println(Long.TYPE + ":   | " + Long.SIZE + "             |" + Long.MIN_VALUE + "  | "
                + Long.MAX_VALUE + " |");
        System.out.println(Line + "___________________________________");
        System.out.println(Float.TYPE + ":  | " + Float.SIZE + "             |" + Float.MIN_VALUE + "               | "
                + Float.MAX_VALUE + "          |");
        System.out.println(Line + "___________________________________");
        System.out.println(Double.TYPE + ": | " + Double.SIZE + "             |" + Double.MIN_VALUE + "              | "
                + Double.MAX_VALUE + "     |");
        System.out.println(Line + "___________________________________");

        /** Создать переменные типа Integer */

        System.out.println("_______________Task 13_______________");

        Integer Num1, Num2;
        Num1 = 5;
        Num2 = 5;
        boolean e1 = Num1.equals(Num2);
        System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + e1);
        Num1 = 7;
        Num2 = 9;
        boolean e2 = Num1.equals(Num2);
        System.out.println("Если num1 не равно num2, то результат сравнения методом .equal = " + e2);

        System.out.println("_______________Task 14_______________");

        int number1;
        int number2;
        number1 = 10;
        number2 = 10;
        System.out.println("Если number1 = number2, то результат сравнения методом .compare = "
                + Integer.compare(number1,number2));
        number1 = 3;
        number2 = 6;
        boolean c2 = number1 == (number2);
        System.out.println("Если number1 < number2, то результат сравнения методом == = " + c2);
        number1 = 7;
        number2 = 1;
        System.out.println("Если number1 > number2, то результат сравнения методом .compare = "
                + Integer.compare(number1,number2));

        /** Создать переменные типа Float */

        System.out.println("_______________Task 15_______________");

        Float f15;
        f15 = 234.9999F;
        System.out.println(f15.intValue()); //округляет до целого без математической точности
        System.out.println(Math.round(f15)); //округлет до целого с учетом математических правил

        /** С помощью метода sum() класса Double посчитать сумму двух переменных типа double */

        System.out.println("_______________Task 16_______________");

        double d15, d16;
        d15 = 10.84;
        d16 = 29.32;
        System.out.println(Double.sum(d15, d16));

        /** С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float */

        System.out.println("_______________Task 17_______________");

        Float f17;
        f17 = 2345.7663F;
        System.out.println(Integer.sum(f15.intValue(),f17.intValue()));

        /** Создать 2 переменные типа Short */

        System.out.println("_______________Task 18_______________");

        Short short1, short2;
        short1 = 12000;
        short2 = 12300;
        System.out.println(("12000 - 12300 = " + Short.compare(short1, short2)));
        short1 = 12500;
        System.out.println(("12500 - 12300 = " + Short.compare(short1, short2)));

        /** ССоздать переменные: */

        System.out.println("_______________Task 19_______________");

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        System.out.println(doub1 - doub2);
        System.out.println((Double.valueOf(str1)) - (Double.valueOf(str2)));

        /** ССоздать переменные: */

        System.out.println("_______________Task 20_______________");

        Double catTC, average, average1;
        catTC = 35.15;
        average = catTC / 2;
        catTC = 41.00;
        average = average + catTC / 2;
        System.out.println(Math.round(average));


        /** Создать переменную n типа Number, присвоить ей максимально возможное значение */

        System.out.println("_______________Task 21_______________");

        System.out.println("Переменная n может принимать значения:");
        Number n;
        n = Long.MAX_VALUE;
        System.out.println(n.longValue());
        n = 10;
        System.out.println(n.byteValue());
        n = 10.999999999;
        System.out.println(n.doubleValue());
        System.out.println("Это возможно, потому что переменная суперкласса Number может быть преобразована в " +
                "типы простых переменых");

        /** Создать переменную Integer numberInteger */

        System.out.println("_______________Task 22_______________");

        Integer numberInteger;
        numberInteger = 100;
        String result22 = numberInteger.toString();
        System.out.println(numberInteger.getClass());
        String numberString = "100";
        System.out.println(numberString.getClass());
        System.out.println("Метод getClass() показывает к какому классу относиться переменая");

        System.out.println("_______________Task 23_______________");

        double gradC = 36.6;
        double gradF = gradC * 1.8 + 32;
        double kg = 50;
        double lbs = kg + 2.205;
        double lbs1 = 50;
        double kg1 = lbs1 + 0.45359293319936;

        System.out.println("36.6 градусов по цельсию = " + gradF + " градусов по Фарингейту" + "\n50 kilogram =  "
                + lbs + "lbs," + "50 lbs = " + kg1 + "kg");



        double weight = 50.13;
        double price = 3.4;
        double bill = weight * price;

        System.out.println(String.valueOf(bill));





    }


}
