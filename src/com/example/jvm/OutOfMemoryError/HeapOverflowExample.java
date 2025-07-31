package com.example.jvm.OutOfMemoryError;

import java.util.ArrayList;
import java.util.List;

public class HeapOverflowExample {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();

        while (true) {
            // Создаем массив размером 1MB
            byte[] array = new byte[1024 * 1024]; // 1MB
            list.add(array);
            System.out.println("Создано объектов: " + list.size());
        }
    }
}
