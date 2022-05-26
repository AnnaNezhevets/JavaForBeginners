package homework;

import java.util.*;

import static homework.MethMyforStudy.ANSI_RED;


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

// Task 1 Написать метод, который принимает на вход строку.
//Если строка не пустая (проверить методом из видео), то примените метод по удалению пробелов в начале строки и в конце строки.
//Догадаться, каким методом из видео можно проверить, были ли пробелы.
//Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
//Если пробелов не было, вернуть сообщение “Пробелов не было”.
//Если строка пустая, вернуть сообщение “Строка пустая”.
    public static String methodForStringEmptyOrFull(String str) {
        String str1 = "";
        if (str != null && str.length() != 0 && str.isEmpty() == false) {
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
        if (str != null && str.length() != 0) {
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
        if (str != null && str.length() != 0) {
            return str.replace(" ", "").replace("0", "");
        }

        return " ";
    }

    //Task 4
//    Написать алгоритм RemoveAllSpaces.
//    С помощью методов из видео1, написать алгоритм, который принимает на вход строку. Если строка валидная,
//    то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
    public static String removeAllSpaces(String str) {
        if (str != null && str.length() > 0) {

            return str.replace(" ", "");
        }

        return " ";
    }

    //Task 5
//    Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
    public static int howLettersA(String str) {
        int count = 0;
        if (str != null && str.length() > 0) {
            str = str.toLowerCase();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    count++;
                }
            }

            return count;
        }

        return 0;
    }

    //Task 6

    //Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
    public static boolean isThereJava(String str) {
        if (str != null && str.length() > 0) {

            return str.trim().contains("Java");
        }

        return false;
    }

    //Task 7 Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
    // точку и кавычки в конце строки с помощью метода concat()
    public static String addInvertedCommas(String str) {
        if (str != null && str.length() > 0) {
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
        if (city != null && city.length() > 0) {
            city = city.substring(0).toLowerCase();

            return city.substring(0, 1).toUpperCase().concat(city.substring(1));
        }

        return " ";
    }

    //Task 9 Напишите метод, который принимает на вход строку, и возвращает все, что находится между первой и последней
    // буквой-параметром
    public static String returnLettersBetweenStartAndEnd(String str) {

        if (str != null && str.length() > 0) {
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
        str = str.toLowerCase();
        if (str != null && str.length() > 0) {
            if ((str.substring(0, 1).equals(str.substring(str.length() - 1)))) {

                return true;
            } else {

                return false;
            }
        }

        return false;
    }

    //Task 11 Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения в виде
    // массива слов
    public static String[] returnWordsInArray(String str) {
        if (str != null && str.length() > 0) {
            String[] words = str.split(" ");

            return words;
        }

        return new String[]{};
    }

    //Task 12 Написать метод, который принимает на вход предложение, состоящее из имени, фамилии, отчества и
    // возвращает массив строк
    public static String[] returnArrayString(String sentence) {
        if (sentence != null && sentence.length() > 0) {
            String newStr[] = sentence.split(" ");

            for (int i = 0; i < newStr.length; i++) {
                if (i == 0) {
                    newStr[i] = "Имя: " + newStr[i];
                } else if (i == 1) {
                    newStr[i] = "Отчество: " + newStr[i];
                } else if (i == 2) {
                    newStr[i] = "Фамилия: " + newStr[i];

                    return newStr;
                }
            }
        }

        return new String[]{};
    }

    //Task 13 Написать метод, который возвращает сумму всех букв слова
    public static int sumAllLetters(String str) {
        int count = 0;
        if (str != null && str.length() != 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < 65) {
                    return 0;
                }
                count += str.charAt(i);
            }

            return count;
        }

        return 0;
    }

    //Task 14 Написать метод, который принимает на вход 2 буквы и возвращает true, если первая буква встречается
    // раньше второй, иначе метод возвращает false
    public static boolean removeLettersInTrueOrFalse (String a, String b){

        if (a.charAt(0) < b.charAt(0)){

            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(capitalizeWorlds("    happy birthday  "));


        Utils.task(1);
        String str1 = "  Написать метод, который принимает на вход строку   ";
        String str1_1 = "Написать метод, который принимает на вход строку";
        String str1_2 = "";
        System.out.println(methodForStringEmptyOrFull(str1));
        System.out.println(methodForStringEmptyOrFull(str1_1));
        System.out.println(methodForStringEmptyOrFull(str1_2));

        Utils.task(2);
        String str2 = "panda   ";
        System.out.println(removeAlla(str2));

        Utils.task(3);
        String str3 = "   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 ";
        String str3_1 = " 0000000111";
        String str3_2 = null;
        System.out.println(removeAllZeros(str3));
        System.out.println(removeAllZeros(str3_1));
        System.out.println(removeAllZeros(str3_2));

        Utils.task(4);
        String str4 = "    QA   4  Everyone   ";
        String str4_1 = "p a     n d a   ";
        System.out.println(removeAllSpaces(str4));
        System.out.println(removeAllSpaces(str4_1));

        Utils.task(5);
        String str5 = "Abracadabra";
        String str5_1 = "Homenum Revelio";
        System.out.println(howLettersA(str5));
        System.out.println(howLettersA(str5_1));

        Utils.task(6);
        String str6 = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support " +
                "Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades";
        String str6_1 = "As a decrepit father takes delight " +
                "To see his active child do deeds of youth, " +
                "So I, made lame by fortune’s dearest spite, " +
                "Take all my comfort of thy worth and truth. " +
                "For whether beauty, birth, or wealth, or wit, " +
                "Or any of these all, or all, or more, " +
                "Entitled in thy parts do crownèd sit, " +
                "I make my love engrafted to this store. " +
                "So then I am not lame, poor, nor despised, " +
                "Whilst that this shadow doth such substance give " +
                "That I in thy abundance am sufficed, " +
                "And by a part of all thy glory live. " +
                "Look what is best, that best I wish in thee. " +
                "This wish I have; then ten times happy me.";
        System.out.println(isThereJava(str6));
        System.out.println(isThereJava(str6_1));

        String str7 = "One";
        Utils.task(7);
        String str7_1 = "    TWO  ";
        System.out.println(addInvertedCommas(str7));
        System.out.println(addInvertedCommas(str7_1));

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
        System.out.println(returnTrueOrFalse(str10));
        System.out.println(returnTrueOrFalse(str10_1));

        Utils.task(11);
        String str11 = "QA for Everyone";
        String str11_1 = "Александр Сергеевич Пушкин";
        String str11_2 = "";
        System.out.println(Arrays.toString(returnWordsInArray(str11)));
        System.out.println(Arrays.toString(returnWordsInArray(str11_1)));
        System.out.println(Arrays.toString(returnWordsInArray(str11_2)));

        Utils.task(12);
        String sentence = "Александр Сергеевич Пушкин";
        System.out.println(Arrays.toString(returnArrayString(sentence)));

        Utils.task(13);
        String str13 = "abc";
        String str13_1 = "ABC";
        String str13_2 = "123";
        System.out.println(sumAllLetters(str13));
        System.out.println(sumAllLetters(str13_1));
        System.out.println(sumAllLetters(str13_2));

        Utils.task(14);
        System.out.println(removeLettersInTrueOrFalse("a", "m"));
        System.out.println(removeLettersInTrueOrFalse("m", "l"));
        System.out.println(removeLettersInTrueOrFalse("a", "a"));

//Task 11_11
        String error = "Error: Precondition failed - Incomplete Input.";
        //System.out.println(error.substring(0, 1).toUpperCase().concat(error.substring(1)));
        for (int i = 1; i < error.length(); i++) {
            if (error.charAt(i) == ' ') {
                error = error.substring(0, i + 1).concat(error.substring(i + 1, i + 2).toUpperCase()).concat(error.substring(i + 2));
            }
        }
        System.out.println(error.replace("F", "f"));



        }
    }

