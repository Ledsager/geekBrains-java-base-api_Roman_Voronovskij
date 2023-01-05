package ru.geekbrains.java.base.api.lesson4.task2;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                sum += n;
            }
            integerLinkedList.add(scanner.nextInt());
            n = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < integerLinkedList.size(); i++) {
            if (integerLinkedList.get(i) % 2 == 0) {
                sum += integerLinkedList.get(i);
            }
        }
        System.out.println("sum = " + sum);
    }
}
