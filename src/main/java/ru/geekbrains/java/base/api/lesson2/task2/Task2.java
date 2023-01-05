package ru.geekbrains.java.base.api.lesson2.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи длинну последовательности: ");
        int n = scanner.nextInt();
        System.out.println("Введи сами числа: ");
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            int b = scanner.nextInt();
            if ((b % 10 == 5) && (a % 2 == 0)) {
                sum += b;
            }
            a = b;
        }
        System.out.println("sum= " + sum);
        scanner.close();
    }
}
