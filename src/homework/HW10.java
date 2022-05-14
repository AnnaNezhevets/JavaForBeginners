package homework;

import java.util.*;


public class HW10 {

    public static String capitalizeWorlds(String sentence) {

        if (sentence != null && sentence.length() != 0) {
            sentence = sentence.trim();

            sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
            System.out.println(sentence);

            for (int i = 1; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    sentence = sentence.substring(0, i + 1)
                            + sentence.substring(i + 1, i + 2).toUpperCase()
                            + sentence.substring(i + 2);
                }

            }

            return sentence;
        }

        return "";
    }

    public static String methodForStringEmptyOrFull(String str) {
        boolean full = false;
        String str1 = "";
        if (full == str.isEmpty()) {
            str1 = str.trim();

            if (str1.length() < str.length()) {

                return str1 = "Лишние пробелы удалены";
            } else if (str1.equals(str)) {

                return str1 = "Пробелов не было";
            }
        } else {

            return "Строка пустая";
        }
        return str1;
    }

    //Task 2
    // С помощью методов из видео1, написать алгоритм RemoveAlla, который принимает на вход строку.
    // Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
    // Метод возвращает обработанную строку.

    public static String removeAlla(String str) {
        if (str != null) {
            str = str.replace('a', ' ');
            str = str.replace(" ", "");
        }

        return str;
    }

    //Task 3
//    С помощью методов из видео1, написать алгоритм, который принимает на вход строку, состоящую из цифр.
//    Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную
//    строку, в которой нет нулей.
    public static String removeAllZeros(String str) {
        if (str != null) {
            str = str.replace(" ", "");
            str = str.replace("0", "");
        }

        return str;
    }

    //Task 4
//    Написать алгоритм RemoveAllSpaces.
//    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
//    то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
    public static String removeAllSpaces(String str) {
        if (str != null) {
            str = str.replace(" ", "");
        }

        return str;
    }

    //Task 5
//    Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
    public static int howLettersA(String str) {
        int count = 0;
        if (str != null && str.length() != 0) {
            str = str.toLowerCase(Locale.ROOT);

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    count++;
                }
            }
        }
        return count;
    }

    //Task 6

    //Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
    public static boolean isThereJava(String str) {
        if (str != null && str.length() != 0) {
            str.contains("Java");
        }

        return str.contains("Java");
    }

    //Task 7 Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
    // точку и кавычки в конце строки с помощью метода concat()
    public static String addInvertedCommas(String str) {
        if (str != null && str.length() != 0) {
            String str1 = "“";
            String str2 = ".”";
            str = str.trim().concat(str2);
            str = str1.concat(str);

            return str;
        }

        return "";
    }

    //Task 8 Напишите метод, который принимает на вход название города и исправляет написание
    public static String replaceNameCity(String city) {
        if (city != null && city.length() != 0) {
            city = city.substring(0).toLowerCase(Locale.ROOT);
            city = city.substring(0, 1).toUpperCase(Locale.ROOT) + city.substring(1);

            return city;
        }

        return "";
    }

    //Task 9 Напишите метод, который принимает на вход строку, и возвращает все, что находится между первой и последней
    // буквой-параметром
    public static String returnLettersBetweenStartAndEnd(String str) {

        if (str != null && str.length() != 0) {
            if (str.contains("b")) {
                str = str.substring(str.indexOf('b'), str.lastIndexOf('b') + 1);
            } else if (str.contains("p")) {
                str = str.substring(str.indexOf('p'), str.lastIndexOf('p') + 1);
            }

            return str;
        }

        return "";
    }

    //Task 10 Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и
    // заканчивается на одинаковую букву, и false иначе

    public static boolean returnTrueOrFalse(String str) {
        //boolean answer = true;
        str = str.toLowerCase(Locale.ROOT);
        if (str != null && str.length() != 0) {
            if ((str.substring(0, 1).equals(str.substring(str.length() - 1)))) {

                return true;
            } else {

                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(capitalizeWorlds("    happy birthday  "));

        //String str1 = "  Написать метод, который принимает на вход строку   ";
        //String str1 = "Написать метод, который принимает на вход строку";
        Utils.task(1);
        String str1 = "";
        System.out.println(methodForStringEmptyOrFull(str1));

        Utils.task(2);
        String str2 = "panda   ";
        System.out.println(removeAlla(str2));

        Utils.task(3);
        //String str3 = "   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 ";
        String str3 = " 0000000111";
        System.out.println(removeAllZeros(str3));

        Utils.task(4);
        //String str4 = "    QA   4  Everyone   ";
        String str4 = "p a     n d a   ";
        System.out.println(removeAllSpaces(str4));

        Utils.task(5);
        String str5 = "Abracadabra";
        //String str5 = "Homenum Revelio";
        System.out.println(howLettersA(str5));

        Utils.task(6);
        String str6 = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support " +
                "Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades";
        //String str6 = "As a decrepit father takes delight " +
//                "To see his active child do deeds of youth, " +
//                "So I, made lame by fortune’s dearest spite, " +
//                "Take all my comfort of thy worth and truth. " +
//                "For whether beauty, birth, or wealth, or wit, " +
//                "Or any of these all, or all, or more, " +
//                "Entitled in thy parts do crownèd sit, " +
//                "I make my love engrafted to this store. " +
//                "So then I am not lame, poor, nor despised, " +
//                "Whilst that this shadow doth such substance give " +
//                "That I in thy abundance am sufficed, " +
//                "And by a part of all thy glory live. " +
//                "Look what is best, that best I wish in thee. " +
//                "This wish I have; then ten times happy me.";
        System.out.println(isThereJava(str6));

//        String str7 = "One";
        Utils.task(7);
        String str7 = "    TWO  ";
        System.out.println(addInvertedCommas(str7));

        Utils.task(8);
        String city1 = "ташкент";
        String city2 = "ЧикаГО";
        System.out.println(replaceNameCity(city1));
        System.out.println(replaceNameCity(city2));

        Utils.task(9);
        String str9 = "Abracadabra";
        String str9_1 = "Whippersnapper";
        System.out.println(returnLettersBetweenStartAndEnd(str9));
        System.out.println(returnLettersBetweenStartAndEnd(str9_1));

        Utils.task(10);
        String str10 = "Abracadabra";
        String str10_1 = "Whippersnapper";
        System.out.println(returnTrueOrFalse(str10_1));




    }


}
