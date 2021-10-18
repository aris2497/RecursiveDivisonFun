package com.example.java;

import java.util.Scanner;

public class DivisionRecursive {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Enter the number: ");
        String numberStr = x.nextLine();

        int number = Integer.parseInt(numberStr);

        if (division(number, 1) * 9 == number) {
            System.out.println("Number is divisible");
        } else {
            System.out.println("Number is not div");
        }
    }

    public static int division(int number, int count) {
        if (number < 9) {
            return count;
        }
        int newNumber = number - 9;
        if (newNumber >= 9) {
            count++;
            return division(newNumber, count);
        } else {
            return count;
        }
    }
}
