package hw8;

import static homework.Utils.*;

public class HW8_1 {

    //Task1

    //Task2

    //Task3 Создать объекты типа Integer, Double, String и присвоить им любые значения.

    static Integer i_1 = new Integer(6);
    static Double d_1 = new Double(7.5);
    static String str_1 = new String("text");


    //Task4 Создать объекты типа Integer, Double, String и присвоить им любые значения.

    //Task6 Создать объекты типа Integer, Double, String и присвоить им любые значения.

    public static void printLine() {
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
    public static double[] arrayMulty(int[] arr) {
        double[] arr1 = new double[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i] * 2.5;
        }

        return arr1;
    }

    //Task11 Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает количество
    // четных чисел в этом массиве

    public static int returnDigitalWithEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //Task12 Написать метод, который принимает на вход массив целых положительных чисел, и возвращает массив нечетных
    // чисел
    public static int[] returnArrayOddDigital(int[] arr) {
        int j = 0;
        int countlengthOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                countlengthOdd++;
            }
        }
        int[] arr1 = new int[countlengthOdd];

        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 0 && arr[i] >= 0) {
                if (arr[i] % 2 != 0) {
                    arr1[j] = arr[i];
                    j++;
                }
            } else {
                System.out.println("Error");
            }
        }
        return arr1;
    }

    //Task13 Написать метод, который принимает на вход массив целых чисел, и возвращает массив значений
    // true или false, если числа больше 10

    public static boolean[] returnTrueOrFalse(int[] array) {
        boolean[] arrBoolean = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                arrBoolean[i] = true;
            } else {
                arrBoolean[i] = false;
                i++;
            }
        }

        return arrBoolean;
    }

    //Task14 Написать метод, который принимает на вход массив слов, и возвращает строку, состоящую из этих слов
    public static String returnPhraseString(String[] array) {
        String text = "";
        for (int i = 0; i < array.length; i++) {
            text += array[i];

        }
        return text;
    }

    //Task15 Написать метод, который принимает массив целых чисел и считает сумму чисел во второй
    // половине массива


    public static int countSumSecondHalf(int[] arr) {
        checkZero(arr);
        int sum = 0;
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
    //Task16 Написать метод, который принимает на вход целое положительные число, в пределах от 1 до 10 исключительно,
    // и возвращает таблицу умножения на это число в виде массива
    //Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

    public static int[] returnArrMult(int i_16) {
        int[] arr = new int[11];
        int mult = 0;
        for (int i = 0; i < arr.length; i++) {
           mult = i * i_16;
           arr[i] = mult;

        }

        return arr;
    }


}



















