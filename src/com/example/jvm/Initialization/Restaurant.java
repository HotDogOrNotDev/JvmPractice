package com.example.jvm.Initialization;

class Restaurant {
    static int tables = 10;           // ← Prepare: выделяется память, инициализируется 0
    static String name = "У Пети";    // ← Prepare: выделяется память, инициализируется null

    static {                          // ← Initialization: выполняется статический блок
        System.out.println("Ресторан готовится к открытию");
        name = "У Пети";              // ← Initialization: присваивается реальное значение
        tables = 10;                  // ← Initialization: присваивается реальное значение
    }

    public static void open() {       // ← Resolve: ссылка на метод разрешается
        System.out.println("Ресторан " + name + " открыт!");
    }
}

