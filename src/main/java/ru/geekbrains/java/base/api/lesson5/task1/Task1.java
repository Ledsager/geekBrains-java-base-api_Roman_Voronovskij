package ru.geekbrains.java.base.api.lesson5.task1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String str = "qqqq we ee assss";
        for (int i = 0; i < str.length(); i++) {
            map.putIfAbsent(str.charAt(i), 0);
            map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            // if (map.containsKey(str.charAt(i))) {
            // map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            // } else {
            // map.put(str.charAt(i),1);
            // }
        }
        // for (Map.Entry<Character, Integer> entry :map.entrySet()) {
        for (var entry : map.entrySet()) {
            System.out.println("буква - " + entry.getKey() + " , встретилась : " + entry.getValue());
        }
    }
}
