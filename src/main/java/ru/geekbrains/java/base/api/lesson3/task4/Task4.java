package ru.geekbrains.java.base.api.lesson3.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        String str = "qwe asd zxc";
        List<String> strList = new ArrayList<>();
        strList.addAll(List.of(str.split(" ")));
        System.out.println("size = " + strList.size());
    }
}
