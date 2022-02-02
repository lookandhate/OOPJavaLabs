package ru.lookandhate.labs;

import ru.lookandhate.labs.lab2.Lab2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Input lab number u want to run: ");

        Scanner scanner = new Scanner(System.in);
        int labToLaunch = scanner.nextInt();
        try {
            String labClass = String.format("ru.lookandhate.labs.lab%d.Lab%d", labToLaunch, labToLaunch);
            System.out.printf("Trying to launch lab with class %s\n", labClass);
            Class<Lab> c = (Class<Lab>) Class.forName(labClass);
            c.getMethod("run").invoke(null);
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}
