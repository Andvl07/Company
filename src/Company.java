


class Company {
    public String name; // название
    public int persons; // количество сотрудников
    public int money; // месячный фонд зарплаты

    // конструктор
    public Company(String name, int persons, int money) {
        this.name = name;
        this.persons = persons;
        this.money = money;
    }

    public void show() {
        System.out.println("В компании " + name + " трудятся " + persons + " сотрудников");
        System.out.println("Фонд зарплаты: " + money);
    }

    public int averageSalary() {
        return money / persons;
    }

    public int maxPersons(int salary) {
        return money / salary;
    }

    public int minus(int minus1 /* налог в % */, int minus2 /* отчисление в ПФ в % */) {
        return money * (minus1 + minus2) / 100;
    }
}



