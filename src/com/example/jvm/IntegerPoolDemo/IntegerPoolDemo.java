package com.example.jvm.IntegerPoolDemo;

public class IntegerPoolDemo {
    public static void main(String[] args) {
        Integer a = 100;  // Из пула
        Integer b = 100;  // Из пула - тот же объект
        Integer c = 200;  // Из пула
        Integer d = 200;  // Из пула - тот же объект
        Integer e = 300;  // НОВЫЙ объект в куче
        Integer f = 300;  // НОВЫЙ объект в куче

        System.out.println(a == b); // true (тот же объект)
        System.out.println(c == d); // false (тот же объект)
        System.out.println(e == f); // false (разные объекты)
    }
}
