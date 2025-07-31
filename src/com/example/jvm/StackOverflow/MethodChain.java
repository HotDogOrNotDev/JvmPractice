package com.example.jvm.StackOverflow;

public class MethodChain {
    public static void main(String[] args) {
        methodA();
    }

    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }

    public static void methodC() {
        methodA(); // Замыкаем цепочку
    }
}