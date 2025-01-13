package Company;


class Company { //поля класса
    public String name; //название
    public int persons; //количество сотурдников
    public int money; //фонд

    public Company(String name, int persons, int money) { //конструктор класса
        this.name = name;
        this.persons = persons;
        this.money = money;
    }

    public void show() { //метод для вывода информации об компании
        System.out.println("В компании " + name + " трудятся " + persons + " сотрудников");
        System.out.println("Фонд зарплаты: " + money);
    }

    public int averageSalary() { //метод для вычисления средней заработной платы
        return money / persons;
    }

    public int maxPersons(int salary) { //метод для вычисления максимального количества сотрудников 
        return money / salary;
    }

    public int minus(int taxPercent, int pensionFundPercent) { //метод для вычисления отчислений
        return money * (taxPercent + pensionFundPercent) / 100;
    }
}
