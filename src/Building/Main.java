package Building;


class Building {
    private int floors; //этажи
    private double area;
    private int residents;

    public Building(int floors, double area, int residents) {
        this.floors = floors;
        this.area = area;
        this.residents = residents;
    }

    public String info() {
        return "Этажи: " + floors + ", Площадь: " + area + " кв.м, Жильцы: " + residents;
    }

    public double areaPerPerson() {
        if (residents == 0) {
            return 0; // Избегаем деления на ноль
        }
        return area / residents;
    }

    public int maxPersons(double minAreaPerPerson) {
        if (minAreaPerPerson <= 0) {
            return 0; // Избегаем деления на ноль или отрицательные значения
        }
        return (int) (area / minAreaPerPerson);
    }
}


