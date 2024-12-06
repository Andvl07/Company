package Tourism;

class TouristFirm {
    String name; // инициализация полей: имени
    int yearOfCreation; // год создания
    String INN; // инн
    double profit; // прибыль за год

    public TouristFirm(String name, int yearOfCreation, String INN, double profit) { // конструктор
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.INN = INN;
        this.profit = profit;
    }

    public String getFirmInfo() { //метод для вывода информации
        return "Название: " + name + ", Год создания: " + yearOfCreation + ", ИНН: " + INN + ", Прибыль: " + profit;
    }

    public String getINN() { //метод возвращения ИНН
        return INN;
    }

    public double getProfit() { //метод возвращения прибыли за год
        return profit;
    }


    @Override
    public String toString() {
        return getFirmInfo();
    }
}


