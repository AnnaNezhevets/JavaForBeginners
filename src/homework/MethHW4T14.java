package homework;

public class MethHW4T14 {

    public static int k = 5;
    public static int l = 10;
    public static int m = 15;
    public static String text = "Результат деления";
    public static String text1 = ", а остаток от деления = ";

        public static void meth() {
            System.out.println(text + " k на l = " + (k / l) + text1 + (k % l) + ";");
            System.out.println(text + " k на m = " + (k / m) + text1 + (k % m) + ";");
            System.out.println(text + " k на m = " + (k / k) + text1 + (k % k) + ";");
            System.out.println(text + " l на m = " + (l / m) + text1 + (l % m) + ";");
            System.out.println(text + " l на m = " + (l / k) + text1 + (l % k) + ";");
            System.out.println(text + " l на m = " + (l / l) + text1 + (l % l) + ";");
            System.out.println(text + " m на k = " + (m / k) + text1 + (m % k) + ";");
            System.out.println(text + " m на k = " + (m / l) + text1 + (m % l) + ";");
            System.out.println(text + " m на k = " + (m / m) + text1 + (m % m) + ";");

        }
}



