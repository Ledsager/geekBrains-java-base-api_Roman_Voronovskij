package ru.geekbrains.java.base.api.lesson2.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи длинну массива: ");
        int n = scanner.nextInt();
        int[] mass = new int[n];
        System.out.println("Введи значения: ");
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }
        int k = 0;
        for (int i = 0; i < n - 1; i++) {
            if (mass[i] == 2 * mass[i + 1]) {
                k++;
            }
        }
        System.out.println("k= " + k);
        scanner.close();
    }
}
