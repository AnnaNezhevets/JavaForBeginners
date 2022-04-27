package homework;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class HW2 {

    public static void main(String[] args) {

        int k = 5;
        int l = 10;
        int m = 15;
        int apple = 100;
        int student = 21;
        int devAppStud = 6;
        String line = "_______________________________";

        System.out.println(k + "," + l + "," + m);
        System.out.println(k + " " + l + " " + m);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println("k = " + k + ";" + " l = " + l + "; m = " + m + ";");

        System.out.println("Сумма k и l = " + (k + l) + ";");
        System.out.println("Разность переменных l и m = " + (l - m) + ";");

        String text = "Результат деления";
        String text1 = ", а остаток от деления = ";

        System.out.println(text + " k на l = " + (k / l) + text1 + (k % l) + ";");
        System.out.println(text + " k на m = " + (k / m) + text1 + (k % m) + ";");
        System.out.println(text + " k на m = " + (k / k) + text1 + (k % k) + ";");
        System.out.println(text + " l на m = " + (l / m) + text1 + (l % m) + ";");
        System.out.println(text + " l на m = " + (l / k) + text1 + (l % k) + ";");
        System.out.println(text + " l на m = " + (l / l) + text1 + (l % l) + ";");
        System.out.println(text + " m на k = " + (m / k) + text1 + (m % k) + ";");
        System.out.println(text + " m на k = " + (m / l) + text1 + (m % l) + ";");
        System.out.println(text + " m на k = " + (m / m) + text1 + (m % m) + ";");

        System.out.println("Если " + apple + " яблок поделить на " + student + " ученика, " +
                "то каждый ученик получит " + "по" + " " + devAppStud + " яблока и " + (apple % student)
                + " яблок останется учителю");

        int f = 48;
        int j = 8;
        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;
        int sumLKM = l + k + m;
        m++;
        m--;
        int m1 = m++;
        int m2 = m--;
        int sumKLMPlusOne = k + l + m1;
        System.out.println(line);
        System.out.println(sumKLMPlusOne);
        System.out.println(line);
        int sumKLMMunOne = k + l + m2;
        System.out.println(sumKLMMunOne);
        System.out.println(line);
        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + (sumKLMPlusOne + sumKLMMunOne)
                + ", " + "а разность m++ и  sumLKM = " + (m2 - sumLKM));

        System.out.println("48 кратно 8 потому, что остаток от деления = " + (f % j));
        System.out.println("49 кратно 7 потому, что остаток от деления = " + (f % j));
        System.out.println("Числа 48 и 8 четные поскольку деляться на 2 без остатка " + (f / 2) + " " + (j / 2));

        System.out.println("Числа 47 и 49 нечетные поскольку при делении на 2 имеют остаток "
                + (47 % 2) + " " + (49 % 2));

        int result21 = (x + 3) * (x + 3);
        int result22 = ((3 + 4 * x) / 5) - ((10 * (y - 5) * (a + b + c)) / x) + 9 * ((4 / x) + ((9 + x) / y));
        //int result23 = (((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y)));

        String Line = " ______________________";

        System.out.println(Line);
        System.out.println("|   task    |" + "  result  " + "|");
        System.out.println(Line);
        System.out.println("|     21    |    " + result21 + "    |");
        System.out.println(Line);
        System.out.println("|     22    |    " + result22 + "   |");
        System.out.println(Line);
        //System.out.println("|     23    |    " + result23 + "   |");
        System.out.println(Line);

        int result23 = ((((5 * x + 7 * y) / (8 * x + 10 * y)) * ((x + y) / 3 * x - y))) / (a + b + c / d
        + (a + b) / (c + d) + a * b);
        System.out.println(result23);


    }
}
