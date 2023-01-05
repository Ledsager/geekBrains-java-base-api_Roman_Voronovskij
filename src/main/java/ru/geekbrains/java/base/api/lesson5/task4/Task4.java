package ru.geekbrains.java.base.api.lesson5.task4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(3, 3);
        map1.put(1, 1);
        map1.put(2, 2);
        System.out.println("map1 = " + map1);
        Map<Integer, Integer> map2 = new LinkedHashMap<>();
        map2.put(3, 3);
        map2.put(1, 1);
        map2.put(2, 2);
        System.out.println("map2 = " + map2);
    }
}
