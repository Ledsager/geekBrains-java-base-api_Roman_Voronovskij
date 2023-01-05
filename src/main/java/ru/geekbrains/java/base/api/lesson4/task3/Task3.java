package ru.geekbrains.java.base.api.lesson4.task3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                sum += n;
            }
            integerLinkedList.add(n);
            n = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < integerLinkedList.size(); i++) {
            if (integerLinkedList.get(i) % 3 != 0) {
                integerLinkedList.set(i, sum);
            }
        }
        System.out.println("integerLinkedList =" + integerLinkedList);
    }
}
