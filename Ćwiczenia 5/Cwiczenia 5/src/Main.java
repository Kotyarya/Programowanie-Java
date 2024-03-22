import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[array.length - i - 1] = i;
        }

        for (int i : array) {
            System.out.println(i);
        }

        */

        /*

        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.floor(Math.random() *(100 - 1 + 1) + 1);
        }


        double min = 100;
        double max = 0;

        for (double i : array) {
            min = i < min ? i : min;
            max = i > max ? i : max;
        }

        for (double i : array) {
            System.out.println(i);
        }

        System.out.println("Min : " + min);
        System.out.println("Max :" + max);

        */

        /*

        double[][] matrix = new double[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = 0;

                if (i + j == 9) {
                    matrix[i][j] = Math.floor(Math.random() *(9 - 0 + 1) + 0);
                }
            }
        }

        for (double[] i : matrix) {
            for (double j : i) {
                System.out.print(j + "  ");
            }

            System.out.println("");
        }

       */

        /*
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please write first chain character");

        String firstString = scanner.next();

        System.out.println("Please write second chain character");

        String secondString = scanner.next();

        String firstCombination = firstString + secondString;

        String secondCombination = secondString + firstString;

        System.out.println("First combination : " + firstCombination);
        System.out.println("Second combination : " + secondCombination);
        System.out.println("Folding two different chains are " + (firstCombination.contentEquals(secondCombination) ? "" : "not ") + "alternating.");


         */

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write word");
        String word = scanner.next().toLowerCase().trim();

        char[] arrayChar = word.toCharArray();

        boolean result = true;

        for (int i = 0; i < arrayChar.length; i++) {
            result = arrayChar[i] == arrayChar[arrayChar.length - i - 1];
        }

        System.out.println(result ? "Your word is a polindrom" : "Your word is not a polindrom");


         */

        /*

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write number n");
        int n = scanner.nextInt();

        char[] array = new char[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i % 2 == 0 ? '+' : '-';
        }

        String result = String.valueOf(array);

        System.out.println(result);

         */


        //System.out.println("Result : " + calcSumArray(new int[]{-1,-4,-6}));


        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write number n");
        int n = scanner.nextInt();
        
        char[] charArray = new String(String.valueOf(n)).toCharArray();

        int[] intArray = new int[charArray.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }

        intArray = Arrays.stream(intArray).sorted().toArray();

        String result = "";

        for (int i = 0; i < intArray.length; i++) {
                result += intArray[intArray.length - i - 1];
        }


        System.out.println(result);

         */




    }

    public static int calcSumArray(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        return result;
    }
}