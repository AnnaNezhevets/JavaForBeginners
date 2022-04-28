package hw8;

public class HW8_1 {

     //Task1

    //Task2

    //Task3 Создать объекты типа Integer, Double, String и присвоить им любые значения.

    static Integer i_1 = new Integer(6);
    static Double d_1 = new Double(7.5);
    static String str_1 = new String("text");


    //Task4 Создать объекты типа Integer, Double, String и присвоить им любые значения.

    //Task6 Создать объекты типа Integer, Double, String и присвоить им любые значения.

    public static void printLine(){
        System.out.println("________________________________________________________");
    }

    //Task7 Написать метод, который принимает на вход 5 целых чисел, и возвращает массив из этих же чисел

    public static int[] returnArrayInt7(int i1, int i2, int i3, int i4, int i5) {
        int[] returnArrayInt7 = new int[5];
        for (int i = 0; i < returnArrayInt7.length; i++) {
            returnArrayInt7[0] = i1;
            returnArrayInt7[1] = i2;
            returnArrayInt7[2] = i3;
            returnArrayInt7[3] = i4;
            returnArrayInt7[4] = i5;
        }

        return returnArrayInt7;
    }

    //Task8 Написать метод, который принимает на вход 5 чисел типа double, и возвращает массив из этих же чисел
    public static double[] returnArrayDouble8(double d1, double d2, double d3, double d4, double d5) {
        double[] returnArrayDouble8 = new double[5];
        for (double i = 0; i < returnArrayDouble8.length; i++) {
            returnArrayDouble8[0] = d1;
            returnArrayDouble8[1] = d2;
            returnArrayDouble8[2] = d3;
            returnArrayDouble8[3] = d4;
            returnArrayDouble8[4] = d5;
        }

        return returnArrayDouble8;
    }

    //Task9 Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
    public static String[] returnArrayString9(String str1, String str2, String str3, String str4, String str5) {
        String[] returnArrayString9 = {str1, str2, str3, str4, str5};
        return returnArrayString9;
    }

    //Task10 Написать метод, который принимает на вход массив целых чисел, и возвращает массив тех же чисел,
    // умноженных на 2.5






}



















