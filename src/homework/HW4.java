package homework;

import javax.swing.*;

import static homework.MethMyforStudy.*;

import static homework.MethHW4T14.*;


public class HW4 {

    public static void apple(int apple, int student){

    int devApToStu;
    int remApToStu;
    System.out.println("Если " + apple + " яблок(а) поделить на " + student
            + " учеников(а), то каждый учитель получит по " + apple / student + " яблок(а), и " + apple % student
            + " яблок(а) останется учителю.");
    }

    public static void apple16(int apple, int student){

        int devApToStu = apple / student;
        int remApToStu= apple % student;
        String t1 = "Если ";
        String t2 = " яблок";
        String t21 = " поделить на ";
        String t3 = " учеников, то каждый учитель получит по ";
        String t4 = ", и ";
        String t5 = " останется учителю.";
        String t6 = "a";
        String t7 = "о";
        if (apple == 42){
            System.out.println(t1 + apple + t2 + t6 + t21 + student + t3 + devApToStu + t2 + t4 + remApToStu + t2 + t5);
        } if (apple == 55){
                System.out.println(t1 + apple + t2 + t21 + student + t3 + devApToStu + t2 + t4 + remApToStu + t2 + t5);
        } if (apple == 1){
            System.out.println(t1 + apple + t2 + t7 + t21 + student + t3 + devApToStu + t2 + t4 + remApToStu + t2
                    + t7 +t5);
        }


    }

    public static void print(String text) {
        System.out.print(text);
    }

    public static void main(String[] args) {

        task();

        print("1)");
        int a = 2;
        int b = 7;
        System.out.println((a == 2) || (b == 7));


        print("2)");
        int a1 = 15;
        int b1 = 3;
        System.out.println(!(a1 > b1));

        print("3)");
        String s = "Сосна";
        String s1 = "Дуб";
        String s2 = "Вишня";
        String s3 = "Клен";
        System.out.println((s.equals(s1)) || (s2.equals(s3)));

        print("4)");
        System.out.println(!(s.equals(s1)));

        print("5)");  //(Не(15 < 3)) И (10 > 20);
        int a2 = 10;
        int b2 = 20;
        System.out.println((!(a1 < b1)) && (a2 > b2));

        print("6)"); //("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
        String con = "Глаза даны чтобы видеть";
        String find = "Глаза даны чтобы видеть";
        String s5 = "Под третьим этажом находится второй этаж";
        System.out.println(Boolean.valueOf((con.equals(find)) && (3 > 2)));

        print("7)");  //(6/2 = 3) ИЛИ (7*5 = 20).
        int a3 = 6 / 2;
        int b3 = 7 * 5;
        System.out.println(Boolean.valueOf((a3 == 3) || (b3 == 20)));

        task();

        print("1)"); //"В минуте 70 секунд") ИЛИ ("Работающие часы показывают время"
        String time = "В минуте 70 секунд";
        String timeT = "В минуте 60 секунд";
        String con1 = "Работающие часы показывают время";
        String clock = "Работающие часы показывают время";
        System.out.println(Boolean.valueOf((time.equals(timeT)) || (con1.equals(clock))));

        print("2)");  //!(28 > 7) И !(300/5 = 60);
        int a4 = 28;
        int b5 = 300 / 50;
        System.out.println(Boolean.valueOf((!(a4 > b)) && (!(b5 == 60))));

        print("3)"); //("Телевизор - электрический прибор") И ("Стекло - дерево");
        String thing = "Телевизор - электрический прибор";
        String con2 = "Телевизор - электрический прибор";
        String glass = "Стекло";
        String wood = "Дерево";
        System.out.println(Boolean.valueOf((thing.equals(con2)) && (glass.equals(wood))));

        print("4)"); //Не((300 < 100))  → ("Жажду можно утолить водой");
        String condition = "Жажду можно утолить водой";
        if (!(300 < 100)) {
            System.out.println(ANSI_GREEN + condition + ANSI_RESET);
        }

        print("5)");  // (75 < 81) → (88 = 88).
        if (75 < 81) {
            System.out.println(ANSI_GREEN + "88 = 88" + ANSI_RESET);
        }

        task();

        System.out.print("a)"); //Андрей старше Светы. Наташа старше Светы
        int andrey = 20;
        int sveta = 10;
        int natasha = 15;
        if ((andrey > sveta) && (natasha > sveta)) {
            System.out.println("Андрей старше Светы. Наташа старше Светы");
        }

        print("b)"); //На полке стоят учебники, а на столе лежат справочники.
        String polka = "1";
        String ychebnik = "1";
        String stol = "2";
        String spravochnick = "2";
        if ((polka.equals(ychebnik))) {
            System.out.print("На полке стоят учебники,");
        }
        if (stol.equals(spravochnick)) {
            System.out.println("а на столе лежат справочники.");
        }

        print("с)"); //БОльшая часть детей — девочки. Остальные - мальчики.
        int girls = 20;
        int boys = 15;
        int all = 35;
        if ((all - girls) >= boys) {
            System.out.println("БОльшая часть детей — девочки. Остальные - мальчики.");
        }

        task();

        int limit = 16;
        int age = 17;
        if (age >= 16) {
            System.out.println(ANSI_GREEN + "Можно получить водительские права" + ANSI_RESET);
        }
        if (age < 16) {
            System.out.println(ANSI_RED + "Нельзя получить водительские права" + ANSI_RESET);
        }

        task();
        //Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно

        System.out.println("(!(Петя едет в автобусе)) && (читает книгу) || (!(смотрит в окно))");
        String ex1 = "Петя не едет в автобусе";
        String ex2 = "Петя не едет в автобусе";
        String read = "читает книгу";
        String lookWindow = "не смотрит в окно";
        String lookWindow1 = "смотрит в окно";
        if (ex1.equals(ex2)) {
            System.out.print("Петя Не едет в автобусе,");
        }
        if (read.equals(read)) {
            System.out.println(" но при этом читает книгу");
        }
        if (lookWindow.equals(lookWindow1)) {
            System.out.println(" или не смотрит в окно.");
        }

        task();
        //"Если с другом ты, это хорошо, а когда наоборот - плохо"
        int friend;
        friend = 1;
        if (friend == 1) {
            System.out.println("это хорошо");
        } else {
            System.out.println("плохо");
        }

        task();
        print("1)"); //Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.
        int age9 = -15;
        if (age9 > 0) {
            if (age9 >= 18) {
                System.out.println("Ты взрослый");
            } else {
                System.out.println("Ты ребенок");
            }
        } else {
            System.out.println("проверить возраст");
        }

        print("2,3)"); //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
        // Иначе идет снег.
        String land = "Сухая";
        if (land == "Мокрая") {
            System.out.println(ANSI_GREEN + "Если земля сухая" + ", значит," + ANSI_RED + "нет дождя." + ANSI_RESET);
        } else if (land != "Сухая") {
            System.out.println(ANSI_GREEN + "Если земля мокрая" + ", то," + ANSI_RED + "идет дождь." + ANSI_RESET);
        } else System.out.println(ANSI_BLUE + "Идет снег" + ANSI_RESET);

        print("4)"); //Если на небе тучи, идет дождь, иначе идет “слепой” дождь.
        String cloud = "тучи";
        if ("тучи" != (cloud)) {
            System.out.println(ANSI_GREEN + "Если на небе тучи, " + ANSI_RED + "идет дождь, " + ANSI_RESET);
        } else {
            System.out.println("иначе, " + ANSI_BLUE + "идет “слепой” дождь." + ANSI_RESET);
        }

        print("5)"); //Если сегодня суббота, значит, завтра воскресенье.
        // Если сегодня пятница, значит, вчера был четверг. Иначе вчера был не четверг, а завтра - не воскресенье
        int friday = 5;
        int sunday = 7;
        int saturday = 6;
        int today = 3;
        if (today == saturday) {
            System.out.println(ANSI_RED + "завтра воскресенье." + ANSI_RESET);
        } else if (today == friday) {
            System.out.println(ANSI_RED + " вчера был четверг" + ANSI_RESET);
        } else {
            System.out.println(ANSI_BLUE + "вчера был не четверг, а завтра - не воскресенье" + ANSI_RESET);
        }

        print("6)"); //Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.
        int action;
        action = 1;
        if (action == 1) {
            System.out.println(ANSI_RED + "прошла вечность" + ANSI_RESET);
        } else {
            System.out.println(ANSI_BLUE + "ждите дальше" + ANSI_RESET);
        }

        print("7)"); //Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.
        int age95;
        age95 = 10;
        String toGraduate = "закончил школу";
        if ((age95 == 18) || ("закончил школу".equals(toGraduate))) {
            System.out.println(ANSI_RED + "ты можешь не жить с родителями" + ANSI_RESET);
        } else {
            System.out.println(ANSI_BLUE + "живи с родителями" + ANSI_RESET);
        }

        task(); //Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
        //Выведите результат работы алгоритма на печать.
        int task10;
        task10 = 5;
        if (task10 % 2 == 0) {
            System.out.println(task10 * 2);
        } else System.out.println(task10 * task10);
        {
        }

        task();//Напишите алгоритм проверки возраста на соответствие условиям (if-else):
        //Голосовать можно с 18 лет
        //Машину можно водить с 16 лет
        //В школу можно идти с 5 лет
        int age11 = 17;
        if (age11 >= 18) {
            System.out.println(ANSI_GREEN + "Голосовать можно" + ANSI_RESET);
        } else System.out.println(ANSI_RED + "Нет избирательного права" + ANSI_RESET);
        if (age11 >= 16) {
            System.out.println(ANSI_GREEN + "Машину можно водить" + ANSI_RESET);
        } else System.out.println(ANSI_RED + "Дождись 16-летия" + ANSI_RESET);
        if ((age11 >= 5) && (age11 <= 7)) {
            System.out.println(ANSI_GREEN + "В школу можно идти" + ANSI_RESET);
        } else System.out.println(ANSI_RED + "Не можешь идти в школу" + ANSI_RESET);

        task(); //Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
        //5 = выдать похвальную грамоту и перевести в следующий класс
        //4 = перевести в следующий класс
        //3 = дать задание на лето и перевести в следующий класс
        //2 = вызвать родителей и оставить в текущем классе на второй год
        int mark;
        mark = 0;
        if ((mark <= 5) || (mark >= 2)) {
        } if (mark == 5) {
            System.out.println("выдать похвальную грамоту и перевести в следующий класс");
        } else if (mark == 4) {
            System.out.println("перевести в следующий класс");
        } else if (mark == 3) {
            System.out.println("дать задание на лето и перевести в следующий класс");
        } else if (mark == 2) {
            System.out.println("вызвать родителей и оставить в текущем классе на второй год");
        }

        task(); //Напишите алгоритм программы, которая проверяет 2 числа.
        // Программа складывает числа, которые делятся на 3 без остатка,
        // и вычитает числа, которые делятся на 5 без остатка.
        // Программа умножает числа, которые делятся на 2 без остатка,
        // но если хотя бы одно число отрицательное,
        // программа умножает результат предыдущего действия на (-1).
        //Если числа не прошли ни одну проверку,
        // программа выводит на печать ошибку о невозможности произвести действия.
        int r;
        int o;
        r = 30;
        o = -30;
        if ((r % 3 == 0) && (o % 3 == 0)) {
            System.out.println(r + o);
        } else if ((r % 5 == 0) && (o % 5 == 0)) {
            System.out.println(r - o);
        } if ((r % 2 == 0) && (o % 2 == 0)) {
            System.out.println(r * o);
        } else if (r < 0) {
            System.out.println(((r + o) * -1));
        } else if (o < 0) {
            System.out.println(((r - o) * -1));
        } else {
            System.out.println("Результаты проверки не прошли действие");
        }

        task();//Распечатать следующие выражения, используя метод и параметры:
        //Результат деления k на l = …, а остаток от деления  = …
        //Результат деления k на m = …, а остаток от деления  = …
        //Результат деления k на k = …, а остаток от деления  = …
        //Результат деления l на m = …, а остаток от деления  = …
        //Результат деления l на k = …, а остаток от деления  = …
        //Результат деления l на l = …, а остаток от деления  = …
        //Результат деления m на k = …, а остаток от деления  = …
        //Результат деления m на l = …, а остаток от деления  = …
        //Результат деления m на m = …, а остаток от деления  = …

        meth();

        task(); //Выполнить задание 18 из HW2 с помощью метода и параметров:
        //а) Создать переменные apple и  student и присвоить им значения 40 и 6 соответственно.
        // Распечатать выражение:
        //Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
        //Распечатать это же выражение со значениями 100 и 21.
        apple(100, 21);

        task();

        apple16(42, 42);
        apple16(55, 5);
        apple16(1, 2);













































    }

}











