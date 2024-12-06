package Building;

import java.util.ArrayList;
import java.util.List;

public class Programm4 {
 
    public static void main(String[] args) {
        // Создаем список зданий
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building(5, 1000, 100));
        buildings.add(new Building(10, 2500, 250));
        buildings.add(new Building(3, 750, 50));
        buildings.add(new Building(1, 200, 0)); // Здание без жильцов


        // Получаем информацию о всех зданиях
        System.out.println("Информация о зданиях:");
        for (Building building : buildings) {
            System.out.println(building.info());
        }

        // Задаем минимальную площадь на человека
        double minArea = 20;

        // Вычисляем максимально возможное количество человек во всех зданиях
        int totalMaxPersons = 0;
        for (Building building : buildings) {
            totalMaxPersons += building.maxPersons(minArea);
        }
        System.out.println("\nМаксимально возможное количество человек во всех зданиях при " + minArea + " кв.м на человека: " + totalMaxPersons);

        // Вычисляем площадь на одного человека в каждом здании
        System.out.println("\nПлощадь на одного человека в каждом здании:");
        for (Building building : buildings) {
            double areaPerPerson = building.areaPerPerson();
            System.out.println(building.info() + ": " + String.format("%.2f", areaPerPerson) + " кв.м/чел");
        }
    }
}

