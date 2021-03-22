package shoppingEngine;

import java.util.ArrayList;

public class BookStorage {

    public static String bookInStorege() {
        ArrayList<String> storagebook = new ArrayList<>();
        storagebook.add("Лучший учебник по Джава");
        storagebook.add("Как стать тестировщиком");
        storagebook.add("Основы автоматизации тестирования");
        return storagebook.get(0);
    }
}