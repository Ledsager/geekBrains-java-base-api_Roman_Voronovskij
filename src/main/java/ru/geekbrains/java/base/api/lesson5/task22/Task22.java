package ru.geekbrains.java.base.api.lesson5.task22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task22 {
    public static void main(String[] args) {
        List<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr2.add(i);
//            arr2.add(i);
        }
        Set<Integer> set = new HashSet<>(arr2);
        if (arr2.size() != set.size()) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
