package com.example.jvm.StackOverflow;

public class StackOverflowExample {
    public static void main(String[] args) {
        infiniteRecursion();
    }

    public static void infiniteRecursion() {
        infiniteRecursion(); // Бесконечная рекурсия
    }
}