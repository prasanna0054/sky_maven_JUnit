package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number = 3628800;
        int factorial = findFactorial(number);

        if (factorial > 0) {
            System.out.println(number + " is equal to " + factorial + "!");
        } else {
            System.out.println(number + " is not a factorial of any positive integer.");
        }
    }
    public static int findFactorial(int num) {
        int currentNumber = num;
        int divisor = 2;

        while (currentNumber != 1 && currentNumber % divisor == 0) {
            currentNumber /= divisor;
            divisor++;
        }

        return currentNumber == 1 ? divisor - 1 : 0;
    }
}