package homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class HW9 {
    public static int[] oddIndices(int[] arr) {
        int count = 0;
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(i > 0) {
                if (i % 2 != 0) {
                    count++;
                }
            } return new int []{};
        }
        int[] arrNew = new int[count];
        int count1 = 0;
        for(int i = 0; i < arr.length; i++) {
        if(i % 2 != 0){
        arrNew[count1] = arr[i];
        count1++;

        }

        }
        return arrNew;
    }

    public static int sumArray(int[] arr){
        int sum = 0;
        int[] arrNew = new int [arr.length];
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

        }

        return sum;
    }

    public static int biggerValue(int i1, int i2){

        int max;
        if (i1 > i2){
            max = i1;
        } else {
            max = i2;

        }

        return max;

    }

    public static void main(String[] args) {

        //int[] arr = new int[]{-45, 590, 234, 985, 12, 68};
        int[] arr = new int[]{0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(oddIndices(arr)));


        //int[] arr3 = {0, 1, 2, 3, 4, 5};
        //int[] arr3 = {10, 20, 30, 40, 50, 60};
        int[] arr3 = {-7, -3};
        System.out.println(sumArray(arr3));

        System.out.println(biggerValue(3333, 9999));

    }




}
