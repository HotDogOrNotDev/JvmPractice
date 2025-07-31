package com.example.jvm.LazyLoading;

class Main {
    public static void main(String[] args) {
        System.out.println("Программа запущена");

        // Класс Helper еще не загружен
        // Helper helper = new Helper(); // ← Если раскомментировать эту строку,
        //    класс Helper загрузится только здесь

        System.out.println("Программа завершена");
    }
}

class Helper {
    static {
        System.out.println("Класс Helper загружен!");
    }
}
