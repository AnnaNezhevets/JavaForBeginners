package lessons;

import org.w3c.dom.ls.LSOutput;

public class lesson7 {

    public static void main(String[] args) {
        // объект типа String со значением "Рыжик"
        String catName = "Рыжик";
        // объект типа String-массив
        String[] catsName ;
        // объект типа String-массив с 8 ячейками
        catsName = new String[8];
        catsName[4] = "Рыжик";
        catsName[1] = "Черныш";
        catsName[6] = "Рыжик";

        // объект типа int-массив, состоящий з 8-ми ячеек
        int[] catsAges = new int[8];

        System.out.println(catName);
        System.out.println(catsName);
        System.out.println(catsAges);
        System.out.println(catsName[4]);
        System.out.println(catsName[7]);
        System.out.println(catsAges[2]);
        System.out.println("_________________________________");

        for (int i = 0; i <= 7; i++){
            System.out.println(catsName[i]);
        }
        System.out.println("_________________________________");
        for(int i = 0; i< 8; i++){
            if(catsName[i] == "Рыжик"){
                System.out.println(catsName[i]);
            }
        }
        System.out.println("_________________________________");

        for (int i = 0; i < 8;i++){
           if(catsName[i] == "Рыжик"){
               System.out.println(i);
           }

        }

        System.out.println("_________________________________");

        for (int i = 1; i < 8;i++) {
            if (catsName[i] == "Черныш") {
                System.out.println(i);

            }
        }







































    }
}
