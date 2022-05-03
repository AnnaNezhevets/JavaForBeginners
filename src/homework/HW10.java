package homework;

import java.util.Locale;

public class HW10 {

    public static String capitalizeWorlds(String sentence){

        if(sentence != null && sentence.length() != 0){
            sentence = sentence.trim();

            sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
            System.out.println(sentence);

            for (int i = 1; i < sentence.length(); i++){
                if(sentence.charAt(i) == ' '){
                    sentence = sentence.substring(0, i + 1)
                    + sentence.substring(i + 1, i + 2).toUpperCase()
                    + sentence.substring(i + 2);
                }

            }

            return sentence;
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWorlds("    happy birthday  "));
    }




}
