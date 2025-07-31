package com.example.jvm.OutOfMemoryError;

import java.util.ArrayList;
import java.util.List;

public class StringHeapOverflow {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        while (true) {
            // Создаем очень длинную строку
            String longString = "A".repeat(1000000); // 1MB строка
            strings.add(longString);
            System.out.println("Создано строк: " + strings.size());
        }
    }
}