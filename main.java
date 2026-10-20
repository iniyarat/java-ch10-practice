/* 
Program: OOP Practice - Combinations
Programmer: Iniya Rathinakumar
Date: October 20th, 2026

Purpose: Use a this formula to solve when given two numbers:
    n!
 -------
 k! (n-k)!  

*/

import java.math.BigInteger;
import java.util.Scanner;

public class Combinations {
    /**
     * Calculates the factorial of a number.
     * @param n the number to calculate the factorial of
     * @return the factorial of n as a BigInteger
     */
    public static BigInteger getNumberOfCombinations(int n, int k) {
        BigInteger numerator = BigInteger.ONE;
        BigInteger denominator1 = BigInteger.ONE;
        BigInteger denominator2 = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= k; i++) {
            denominator1 = denominator1.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= n - k; i++) {
            denominator2 = denominator2.multiply(BigInteger.valueOf(i));
        }
        return numerator.divide(denominator1.multiply(denominator2));
    }

    /**
     * Gets input from the user and displays the result.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter k: ");
        int k = input.nextInt();
        System.out.println("The C(n, k) is " + getNumberOfCombinations(n, k));
        input.close();
    }
}