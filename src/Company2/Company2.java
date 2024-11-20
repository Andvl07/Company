public class Company2 {
    
    public class Company {
        public String name; // название компании
        public int persons; // количество сотрудников
        public int money; // месячный фонд зарплаты
    }
    
    public class MyDemo {
        public static void main(String[] args) {
            Company company1 = new Company();
            company1.name = "Computers";
            company1.persons = 100;
            company1.money = 1000000;
    
            Company company2 = new Company();
            company2.name = "Books";
            company2.persons = 200;
            company2.money = 2000000;
    
            // появление недоступного объекта
            company1 = company2;
    
            System.out.println("В компании " + company1.name + " трудятся " + company1.persons + " сотрудников");
            System.out.println("Фонд зарплаты: " + company1.money);
        }
    }
    
}
