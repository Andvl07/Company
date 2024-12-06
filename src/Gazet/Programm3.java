package Gazet;

import java.util.ArrayList;
import java.util.List;


    public class Programm3 {
    public static void main(String[] args) {
        // Создаем список газет
        List<Newspaper> newspapers = new ArrayList<>();
        newspapers.add(new Newspaper("Московские новости", 100000, 16));
        newspapers.add(new Newspaper("Вечерний город", 50000, 8));
        newspapers.add(new Newspaper("Спортивная жизнь", 20000, 4));


        // Выводим информацию о всех газетах
        System.out.println("Информация о газетах:");
        for (Newspaper newspaper : newspapers) {
            System.out.println(newspaper.info());
        }

        // Изменяем название и количество полос одной газеты
        try {
            newspapers.get(0).changeName("Новые Московские новости");
            newspapers.get(0).changeNumber(24);
            System.out.println("\nИнформация о газете 1 после изменений:");
            System.out.println(newspapers.get(0).info());
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}

