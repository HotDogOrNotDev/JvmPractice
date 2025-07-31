package com.example.jvm.Initialization.Netology;

class Netology {
    static int a = initStaticField(); // Статическое поле, инициализируемое методом

    static { // Статический блок инициализации
        System.out.println("static init");
    }

    static int initStaticField() { // Статический метод для инициализации
        return 42;
    }
}
