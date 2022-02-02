package ru.lookandhate.labs.lab1;

import java.util.Scanner;

public class Lab1 {
    public static void run() {
        System.out.println("Lab1 running");
        // Task 1.6
        System.out.println("""
                Choose running method:
                1)Task A (while)
                2)Task A (do while)
                """);
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> taskAWhile();
            case 2 -> taskADoWhile();
            default -> System.out.println("Incorrect input");
        }
        sc.close();
    }

    public static void taskAWhile() {
        System.out.print("Input n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        float s = 0;
        while (n > 0) {
            s += 1.0 / n;
            n--;
        }
        System.out.println(s);
        scanner.close();
    }

    public static void taskADoWhile() {
        System.out.print("Input n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float s2 = 0;
        do {
            s2 += 1.0 / n;
            n--;
        }
        while (n > 0);
        System.out.println(s2);
        scanner.close();

    }
}
