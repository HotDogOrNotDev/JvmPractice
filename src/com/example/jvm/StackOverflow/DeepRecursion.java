package com.example.jvm.StackOverflow;

public class DeepRecursion {
    public static void main(String[] args) {
        factorial(1000000); // Очень глубокий вызов
    }

    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1); // Рекурсия
    }
}