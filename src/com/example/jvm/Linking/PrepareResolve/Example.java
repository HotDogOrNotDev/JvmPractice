package com.example.jvm.Linking.PrepareResolve;

class Example {
    static int staticField = 10;  // ← Prepare: выделяется память, инициализируется значением 0
    static String text = "Hello"; // ← Prepare: выделяется память, инициализируется null

    public static void main(String[] args) {
        // ← Resolve: символьная ссылка на метод main заменяется на реальный адрес
        System.out.println(staticField); // ← Resolve: ссылка на staticField заменяется на адрес
    }
}

/*
 Этап 1: Loading (Подгрузка)
ClassLoader находит файл Example.class
Загружает байт-код класса Example в память JVM

Этап 2: Linking (Связывание)
Verify (Проверка):
-- Проверяется корректность байт-кода класса Example
-- Проверяется безопасность операций
Prepare (Подготовка):
-- Выделяется память для staticField (4 байта для int)
-- Выделяется память для text (4 байта для ссылки на String)
-- staticField инициализируется значением 0
-- text инициализируется значением null
Resolve (Разрешение ссылок):
-- Символическая ссылка на метод main заменяется на реальный адрес в памяти
-- Символическая ссылка на поле staticField заменяется на адрес в памяти
-- Символическая ссылка на System.out.println заменяется на адрес метода

Этап 3: Initialization (Инициализация)
-- staticField получает значение 10 (вместо 0)
-- text получает значение "Hello" (вместо null)
-- Класс Example полностью готов к использованию"
*/
