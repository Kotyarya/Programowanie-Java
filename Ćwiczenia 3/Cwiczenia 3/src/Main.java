import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        /* Exercise 1
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Prosze podac pierwsza liczbe");
        float firstNumber = myScanner.nextFloat();

        System.out.println("Prosze podac druga liczbe");
        float secondNumber = myScannerAksamitnyi.nextFloat();


        float sum = firstNumber + secondNumber;
        System.out.println("Sum : " + firstNumber + " + " + secondNumber + " = " + String.format("%.02f", sum));

        float subtraction = firstNumber - secondNumber;
        System.out.println("Substraction : " + firstNumber + " - " + secondNumber + " = " + String.format("%.02f", subtraction));

        float multiplication = firstNumber * secondNumber;
        System.out.println("Multiplication : " + firstNumber + " * " + secondNumber + " = " + String.format("%.02f", multiplication));

        float divine = firstNumber * secondNumber;
        System.out.println("Divine : " + firstNumber + " / " + secondNumber + " = " + String.format("%.02f", divine));
        */


        /* Exercise 2
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please write your height in meters");
        float height = myScanner.nextFloat();

        System.out.println("Please write your weight in kilograms");
        float weight = myScanner.nextFloat();

        float BMI = weight / (Math.Pow(height,2));

        System.out.println("Your BMI : " + BMI);
        System.out.println("Result :");
        if (BMI < 16) {
            System.out.println("starvation");
        } else if (BMI < 16.99) {
            System.out.println("emaciation");
        } else if (BMI < 18.49) {
            System.out.println("underweight");
        } else if (BMI < 22.99) {
            System.out.println("standard low range");
        } else if (BMI < 24.99) {
            System.out.println("standard high range");
        } else if (BMI < 27.49) {
            System.out.println("overweight low range");
        } else if (BMI < 29.99) {
            System.out.println("overweight high range");
        } else if (BMI < 34.99) {
            System.out.println("first degree obesity");
        } else if (BMI < 39.99) {
            System.out.println("second degree obesity");
        } else if (BMI > 40) {
            System.out.println("third degree obesity");
        }
        */


        /* Exercise 3
        Scanner myScanner = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");

        float a;

        do {
            System.out.println("a : ");
            a = myScanner.nextFloat();
        } while (a == 0);

        System.out.println("b : ");
        float b = myScanner.nextFloat();
        System.out.println("c : ");
        float c = myScanner.nextFloat();

        Float x1;
        Float x2;

        if (b == 0 && c == 0) {
            x1 = (float) 0;
            out.println("X = " + x1);
        } else if (b != 0 && c == 0) {
            x1 = (float) 0;
            x2 = -(b / a);
            out.println("X1 = " + x1);
            out.println("X2 = " + x2);
        } else if (b == 0 && (-1 * (c / a)) < 0) {
            out.println("There is no solution");
        } else if (b == 0 && (-1 * (c / a)) > 0) {
            x1 = (float) sqrt((double) -1 * (c / a));
            x2 = -1 * x1;
            out.println("X1 = " + x1);
            out.println("X2 = " + x2);
        } else if (b != 0 && c != 0) {
            float d = (float) sqrt(pow(b, 2) - 4 * a * c);

            x1 = (-b + d) / 2 * a;
            x2 = (-b - d) / 2 * a;

            if (x1.isNaN() || x2.isNaN()) {
                out.println("There is no solution");
            } else {
                out.println("X1 = " + String.format("%.02f", x1));
                out.println("X2 = " + String.format("%.02f", x2));
            }

        }
        */



        /* Exercise 4

        int result = 0;

        for (int i = 1; i <= 100; i++) {
            result += i % 2 == 0 ? i : 0;
        }


        System.out.println("Result : " + result);
        */


        /* Exercise 5
        int i = 1;
        int min = 100;
        int max = 0;

        while (i <= 10) {
            int num = (int)Math.floor(Math.random() *(100 - 1 + 1) + 1);
            System.out.println("Random number : " + num);
            i++;

            min = num < min ? num : min;
            max = num > max ? num : max;
        }

        System.out.println("Max number : " + max);
        System.out.println("Min number : " + min);
        */
    }
}