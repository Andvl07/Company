package Company;
import java.util.Scanner;
import java.util.ArrayList;

class Program {
    private static ArrayList<Company> companies = new ArrayList<>(); // Динамический массив

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (true) {
             System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить компанию");
            System.out.println("2. Удалить компанию");
            System.out.println("3. Показать список компаний");
            System.out.println("4. Выход");


            int choice = in.nextInt();
            in.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    addCompany(in);
                    break;
                case 2:
                    removeCompany(in);
                    break;
                case 3:
                    showAllCompanies();
                    break;
                case 4:
                     System.out.println("Завершение программы.");
                    in.close();
                    return;
                default:
                    System.out.println("Некорректный выбор, попробуйте снова.");
            }

        }
    }

    // Метод для добавления компании
    private static void addCompany(Scanner in) {
         System.out.println("Введите название компании:");
         String name = in.nextLine();

        System.out.println("Введите количество сотрудников:");
        int persons = in.nextInt();
         System.out.println("Введите месячный фонд зарплаты:");
        int money = in.nextInt();
        in.nextLine(); // Очистка буфера
        Company newCompany = new Company(name, persons, money);
        companies.add(newCompany);
        System.out.println("Компания " + name + " добавлена.");
    }

    // Метод для удаления компании
    private static void removeCompany(Scanner in) {
        if (companies.isEmpty()) {
            System.out.println("Список компаний пуст. Удаление невозможно.");
            return;
        }
        showAllCompanies();
         System.out.println("Введите номер компании для удаления:");
         int index = in.nextInt();
        in.nextLine(); // Очистка буфера
       

        if (index >= 0 && index < companies.size()) {
            companies.remove(index);
           System.out.println("Компания под номером " + index + " удалена.");
        } else {
            System.out.println("Некорректный номер компании.");
        }
    }

        // Метод для показа списка всех компаний
        private static void showAllCompanies() {
           if (companies.isEmpty()) {
            System.out.println("Список компаний пуст.");
            return;
            }
           for (int i = 0; i < companies.size(); i++) {
               Company company = companies.get(i);
               System.out.println("Компания " + i + ":");
               company.show();
               System.out.println("Средняя зарплата: " + company.averageSalary());
               System.out.println("Отчисления: " + company.minus(13, 4));
               System.out.println("Максимальное количество сотрудников: " + company.maxPersons(10000));
               System.out.println();
           }
        }
}
