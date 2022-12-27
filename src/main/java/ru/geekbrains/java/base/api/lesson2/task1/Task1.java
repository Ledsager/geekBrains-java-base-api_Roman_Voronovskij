package ru.geekbrains.java.base.api.lesson2.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введи число: ");
        double x = scanner.nextDouble();
        System.out.print("введи степень: ");
        int n = scanner.nextInt();
        scanner.close();
        double result = x;
        for (int i = 1; i < n; i++) {
            result *= x;
        }
        System.out.println("result= " + result);
    }
}
