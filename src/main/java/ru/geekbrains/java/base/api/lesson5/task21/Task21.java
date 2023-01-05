package ru.geekbrains.java.base.api.lesson5.task21;

import java.util.HashSet;
import java.util.Set;

public class Task21 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 3};
        Set<Integer> set = new HashSet<>();
        boolean f = true;
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                f = false;
                break;
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println(f);
    }
}
