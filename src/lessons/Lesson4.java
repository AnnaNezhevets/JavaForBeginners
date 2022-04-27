package lessons;

public class Lesson4 {

    static public void main(String[] args) {

        int n = 3;
        int expectedResult = 1;

        if (n % 2 != 0) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                n = n * 3;
            }
        } else {
            n = n * (n / 2);
        }

        System.out.println("n = " + n);

//Test
        if (expectedResult == n) {
            System.out.println("\u001B[32m" + "Pass");
        } else {
            System.out.println("\u001B[31m" + "Fail");
        }
    }
    }
