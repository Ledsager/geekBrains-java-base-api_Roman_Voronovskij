package ru.geekbrains.java.base.api.lesson5.task3;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 47, 87, 4, 7, 3};
        int[] nums2 = new int[]{3, 5, 6, 3, 47};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                System.out.println("значение: " + nums2[i]);
                set.remove(nums2[i]);
            }
        }
    }
}
