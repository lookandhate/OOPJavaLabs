package ru.lookandhate.labs.lab2;

import ru.lookandhate.labs.Lab;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Lab2 implements Lab {
    public static void run() {
        System.out.println("Running lab2");
        System.out.println("""
                Choose running method:
                1)Task A
                2)Task B
                3)Task B (do while cycle)
                """);
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> taskA();
            case 2 -> taskB();
            case 3 -> taskBDoWhile();
            default -> System.out.println("Incorrect input");
        }
    }

    private static void taskA() {
        System.out.print("Input n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = n;
        while (i > 0) {
            int j = i;
            while (j <= i * n) {
                System.out.printf("%d ", j);
                j += i;
            }
            System.out.println();
            i -= 1;
        }

        System.out.println("\ndo while goes below");

        int i2 = n;
        do {
            int j = i2;
            do {
                System.out.printf("%d ", j);
                j += i2;
            }
            while (j <= i2 * n);
            System.out.println();
            i2 -= 1;
        }
        while (i2 > 0);

    }

    private static void taskB() {
        System.out.print("Input n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n2 = n;
        int temp1 = 5;
        int temp2 = 1;
        while (n > 0) {
            int j = 1;
            int spacess = abs(n - 5);
            while (spacess > 0) {
                System.out.print("  ");
                spacess--;
            }
            while (j <= temp1) {

                if (j >= temp2) {
                    System.out.printf("%d ", j);

                }
                j++;
            }
            System.out.println();
            n--;
            temp2++;
        }

        temp2--;
        temp2--;
        while (temp2 >= 1) {

            int spaces = abs(5 - temp2) + 3;
            while (spaces > 0) {
                System.out.print("  ");
                spaces--;
            }
            int j = 5;
            while (j >= temp2) {
                System.out.printf("%d ", j);
                j--;
            }
            System.out.println();
            temp2--;
        }
    }

    private static void taskBDoWhile() {
        System.out.print("Input n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n2 = n;
        int temp1 = 5;
        int temp2 = 1;
        do {
            int j = 1;
            int spacess = abs(n - 5);
            do {
                System.out.print("  ");
                spacess--;
            } while (spacess > 0);
            do {

                if (j >= temp2) {
                    System.out.printf("%d ", j);

                }
                j++;
            } while (j <= temp1);
            System.out.println();
            n--;
            temp2++;
        } while (n > 0);

        temp2--;
        temp2--;
        do {

            int spaces = abs(5 - temp2) + 3;
            do {
                System.out.print("  ");
                spaces--;
            } while (spaces > 0);
            int j = 5;
            do {
                System.out.printf("%d ", j);
                j--;
            } while (j >= temp2);
            System.out.println();
            temp2--;
        } while (temp2 >= 1);
    }
}
