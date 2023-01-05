package ru.geekbrains.java.base.api.lesson6.task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2));
        Set<Integer> set = new HashSet<>(array);
        double percent = set.size() * 100 / array.size();
        System.out.println("percent =" + percent);
    }
}
