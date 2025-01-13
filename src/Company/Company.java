package Company;



class Company {
    public String name;
    public int persons;
    public int money;

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

    public int minus(int taxPercent, int pensionFundPercent) {
        return money * (taxPercent + pensionFundPercent) / 100;
    }
}
