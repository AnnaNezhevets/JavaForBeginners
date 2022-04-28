package homework;

import java.util.Arrays;

import static homework.MethMyforStudy.*;
import static homework.HW5.*;

public class HW7 {

    //18 Написать метод, который принимает на вход массив int, и возвращает среднее значение.
    // Проверить работу метода тестом, если параметр - массив catsAges

    public static int argueTask18(int[] catsAges) {
        int sum = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum = sum + catsAges[i];
        }

        return ((sum / catsAges.length));

    }


    public static void main(String[] args) {

        task(); //1 Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
        String[] catNames = new String[8];
        catNames[0] = "Хмурый";
        catNames[1] = "Уголек";
        catNames[2] = "Васька";
        catNames[3] = "Барсик";
        catNames[4] = "Рыжик2";
        catNames[5] = "Белочка";
        catNames[6] = "Рыжик";
        catNames[7] = "Басик";

        task();//2 В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
        // а значение элемента с индексом 1 на “Черныш”
        catNames[1] = "Черныш";
        catNames[4] = "Рыжик";
        for (int i = 0; i < 8; i++) {
            System.out.print(catNames[i] + " ");
        }

        task();//3 Создать массив catsColors и заполнить его значениями.
        String[] catColors = {"gray", "black", "gray", "brown", "red", "gray", "red", "gray"};
        for (int i = 0; i < 8; i++) {
            System.out.print(catColors[i] + ", ");
        }

        task(); //4 Создать массив catsAges и заполнить его любыми значениями.
        int[] catAges = {2, 4, 1, 3, 1, 5, 1, 7};
        for (int i = 0; i < 8; i++) {
            System.out.print(catAges[i] + " ");
        }

        task(); //5 Создать массив isCatRed и заполнить его соответствующими значениями
        boolean[] isCatRed = {false, false, false, false, true, false, true, false};
        for (int i = 0; i < isCatRed.length; i++) {
            System.out.print(isCatRed[i] + " ");
        }

        task(); //6 Распечатать для массивов catsNames и catsColors:
//        имя кота в коробке с номером 6
        for (int i = 0; i < 8; i++) {
            if (i == 6) {
                System.out.println(catColors[i] + " ");
            }
        }
        System.out.println("___________________________" + "\n");
//        имена котов из коробок с четными индексами
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.print(catColors[i] + " ");
            }
        }
        System.out.println("\n" + "___________________________" + "\n");
        //имена котов из коробок, чьи индексы кратны 4
        for (int i = 0; i < 8; i++) {
            if (i % 4 == 0) {
                System.out.print(catColors[i] + "\n");
            }
        }
        System.out.println("___________________________" + "\n");
//        цвет котов из коробок с нечетными индексами
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                System.out.print(catColors[i] + ", ");
            }
        }
        System.out.println("\n" + "___________________________" + "\n");
//        цвет котов из коробок, чьи индексы кратны 3
        for (int i = 0; i < 8; i++) {
            if (i % 3 == 0) {
                System.out.print(catColors[i] + ", ");
            }
        }

        task(); //7 Распечатать “Накорми кота!” для всех серых котов
        for (int i = 0; i < 8; i++) {
            if ("gray".equals(catColors[i])) {
                System.out.println("Накорми кота!");
            }
        }
        task(); //8 Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        for (int i = 0; i < 8; i++) {
            if (catAges[i] < 2) {
                System.out.println("Отнеси кота на прививку!");
            }
        }

        task(); //9 Для кота в последней коробке распечатать имя, цвет, возраст
        for (int i = 0; i < catColors.length; i++) {
            if ((catColors.length == catColors.length) && (catColors.length == catAges.length)) {
                if (i == (catColors.length - 1)) {
                    System.out.println(catColors[i] + " - " + catColors[i] + " - " + catAges[i]);
                }
            }
        }

        task(); //10 Распечатать имена всех котов, чей возраст больше 2 лет
        for (int i = 0; i < 8; i++) {
            if (i > 2) {
                System.out.print(catColors[i] + ", ");
            }
        }

        task(); //11 Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
        if ((isCatRed.length == catColors.length) && (catColors.length != 0)) {
            for (int i = 0; i < isCatRed.length; i++) {
                if ((isCatRed[i] == true) && (catColors[i].equals("Рыжик"))) {

                    System.out.println("Накорми кота");

                }
            }
        }

        task(); //12 Распечатать средний возраст котов из массива catsAges
        double sum = 0;
        for (int i = 0; i < catAges.length; i++) {
            sum = sum + catAges[i];
        }
        System.out.printf("%.1f%n", sum / catAges.length);

        task(); //13 Распечатать возраст самого молодого кота
        int min = catAges[0];
        for (int i = 0; i < catAges.length; i++) {
            if (min > catAges[i]) {
                min = catAges[i];
            }
        }
        System.out.println(min);
        task(); //14 Распечатать возраст самого старого кота
        int max = catAges[0];
        for (int i = 0; i < catAges.length; i++) {
            if (max < catAges[i]) {
                max = catAges[i];
            }
        }
        System.out.println(max);

        task(); //15 Распечатать количество серых котов
        int grayCat = 0;
        for (int i = 0; i < catColors.length; i++) {
            if (catColors[i].equals("gray")) {
                grayCat++;
            }
        }
        System.out.println("Всего серых котов " + grayCat);

        task(); //16 Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
        for (int i = 0; i < catAges.length; i++) {
            if ((i % 2 == 0) && (i < 4)) {
                System.out.print(catNames[i] + ", ");
            }

        }

        task(); //17 Создать массив четных положительных чисел, значения которых не больше 10.
        // (заполняем значения с помощью цикла for)

        // вариант а
        int count = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int[] massive = new int[count];
        count = 0;
//
        for(int j = 0; j < 11; j++){
            if(j % 2 == 0){
                massive[count] = j;
                count++;
            }
        }

        System.out.println(Arrays.toString(massive));

        task(); //18
        System.out.println("Средний возраст котов " + argueTask18(catAges) + " года");
        verifyEquals(3, argueTask18(catAges));

        task(); //19 Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900
        int count19 = 0;
        for(int i = -1000; i < -899; i++){
            if(i % 2 != 0){
               count19++;
            }
        }
        int [] negative = new int [count19];
        for (int i = -1000, k = 0; i < -900; i++){
            if(k < negative.length){
                if(i % 2 != 0) {
                    negative[k] = i;
                    System.out.print(negative[k] + ", ");
                    k++;
                }
            }
        }

        task();//20 Создать массив из 10 случайных положительных целых чисел
        int[] arrRandom = new int[10];
        for (int i = 0; i < arrRandom.length; i++ ){
            arrRandom[i] = ((int) (Math.random() * 10));
                System.out.print(arrRandom[i] + " ");
            }


    }
}