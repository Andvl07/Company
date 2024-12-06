package Building;


class Building {
    private int floors; //этажи
    private double area; //площадь
    private int residents; //жильцы

    public Building(int floors, double area, int residents) { // инициализация конструкторов
        this.floors = floors;
        this.area = area;
        this.residents = residents;
    }

    public String info() { // иниицализация метода для вывода информации о здании
        return "Этажи: " + floors + ", Площадь: " + area + " кв.м, Жильцы: " + residents;
    } 

    public double areaPerPerson() { // метод для нахождения количеста жилой площади на человека
        if (residents == 0) {
            return 0; // Избегаем деления на ноль
        }
        return area / residents;
    }

    public int maxPersons(double minAreaPerPerson) { // инизиализация метода вычисл. макс. количества человек в здании
        // с учётом минимальной площади на одного человека
        if (minAreaPerPerson <= 0) {
            return 0; // Избегаем деления на ноль или отрицательные значения
        }
        return (int) (area / minAreaPerPerson);
    }
}


