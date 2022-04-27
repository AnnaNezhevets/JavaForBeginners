package homework;

public class HW21 {
   public static void main(String[] args){

       int k = 5;
       int l = 10;
       int m = 15;
       String line = "_______________________________";
       int a = k;
       int b = l;
       int c = m;

       System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + ((k + l + (m++)) + (k + l + (m--))
               + ", " + "а разность m++ и  sumLKM = " + ((m--) - (l + k +m))));



   }
}
