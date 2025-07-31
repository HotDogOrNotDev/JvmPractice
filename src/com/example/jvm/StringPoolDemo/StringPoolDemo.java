package com.example.jvm.StringPoolDemo;

public class StringPoolDemo {
    public static void main(String[] args) {
        // 1. Создание строк через литералы - попадают в String Pool
        String str1 = "Hello";           // Создается в String Pool
        String str2 = "Hello";           // Переиспользуется из String Pool
        String str3 = "World";           // Новый объект в String Pool

        // 2. Создание через new - НЕ попадает в String Pool
        String str4 = new String("Hello"); // Новый объект в Heap

        // 3. Проверка ссылок
        System.out.println("str1 == str2: " + (str1 == str2)); // true - одна ссылка
        System.out.println("str1 == str4: " + (str1 == str4)); // false - разные объекты

        // 4. intern() - добавляет строку в String Pool
        String str5 = str4.intern();     // Добавляет "Hello" в String Pool
        System.out.println("str1 == str5: " + (str1 == str5)); // true
    }
}
