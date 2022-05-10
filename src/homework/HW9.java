package homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class HW9 {
    public static int[] oddIndices(int[] arr) {
        int count = 0;
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                if (i % 2 != 0) {
                    count++;
                }
            }
            return new int[]{};
        }
        int[] arrNew = new int[count];
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arrNew[count1] = arr[i];
                count1++;

            }

        }
        return arrNew;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        return sum;
    }

    public static int biggerValue(int i1, int i2) {

        int max;
        if (i1 > i2) {
            max = i1;
        } else {
            max = i2;

        }

        return max;

    }

    public static boolean isPositiveNumber(int i) {
        if (i >= 0) {
            return true;
        } else {
        }
        return false;
    }

    public static int areNumbersEqual(int i1, int i2) {
        int answer = 0;

        if (i1 == i2) {
            answer = 0;
        } else if (i1 < i2) {
            answer = -1;
        } else if (i1 > i2) {
            answer = 1;
        }
        return answer;

    }

    public static String determineMultipleNumberM(int m) {
        String message = null;
        if (m % 3 == 0 && m % 5 == 0) {
            message = "Good Number";
        } else if (m % 3 == 0 && m % 5 != 0) {
            message = "Bad Number";
        } else if (m % 3 != 0 && m % 5 == 0) {
            message = "Poor Number";
        } else if (m % 3 != 0 && m % 5 != 0) {
            message = "-1";
        }

        return message;
    }

    public static int[] minMaxAve(int[] arr, int start, int end) {
        if (arr.length == 0 || start < 0 || end > (arr.length - 1) || start > end) {

            return new int[]{};
        }
            int[] arrNew = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};

            for (int i = start; i <= end; i++) {
                if(arr[i] < arrNew[0]){
                    arrNew[0] = arr[i];
                }
                if(arr[i] > arrNew[1]){
                    arrNew[1] = arr[i];
                }
                arrNew[2] = arrNew[2] + arr[i];
            }

            arrNew[2] = arrNew[2] / (end - start + 1);
//
        return arrNew;
    }

        public static void main (String[]args){

            //int[] arr = new int[]{-45, 590, 234, 985, 12, 68};
            int[] arr = new int[]{0, 0, 0, 0, 0, 0};
            System.out.println(Arrays.toString(oddIndices(arr)));


            //int[] arr3 = {0, 1, 2, 3, 4, 5};
            //int[] arr3 = {10, 20, 30, 40, 50, 60};
            int[] arr3 = {-7, -3};
            System.out.println(sumArray(arr3));

            System.out.println(biggerValue(3333, 9999));

            int i5 = 0;
            System.out.println(isPositiveNumber(i5));

            System.out.println(areNumbersEqual(89, 89));

            System.out.println(determineMultipleNumberM(15));
            System.out.println(determineMultipleNumberM(9));
            System.out.println(determineMultipleNumberM(25));
            System.out.println(determineMultipleNumberM(11));
            System.out.println(determineMultipleNumberM(0));
            System.out.println(Arrays.toString(minMaxAve(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 6)));
            System.out.println(Arrays.toString(minMaxAve(new int[]{}, 2, 6)));
            System.out.println(Arrays.toString(minMaxAve(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 6, 2)));
            System.out.println(Arrays.toString(minMaxAve(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 7)));


        }


    }
