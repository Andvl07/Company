package Tourism;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programm5 {

    public static void main(String[] args) { // создание коллекции
        List<TouristFirm> firms = new ArrayList<>();

        firms.add(new TouristFirm("TripMaster", 2005, "1234567890", 150000));
        firms.add(new TouristFirm("TravelLand", 2010, "9876543210", 200000));
        firms.add(new TouristFirm("AdventureTime", 2015, "5555555555", 100000));
        firms.add(new TouristFirm("Globetrotter", 2020, "1111111111", 250000));


        // Найти ИНН и прибыль заданной фирмы
        String firmToFind = "TravelLand";
        findFirmInfo(firms, firmToFind);

        // Найти суммарную прибыль всех фирм
        double totalProfit = calculateTotalProfit(firms);
        System.out.println("\nСуммарная прибыль всех фирм: " + totalProfit);

        // Найти фирму с наибольшей прибылью
        TouristFirm mostProfitableFirm = findMostProfitableFirm(firms);
        System.out.println("\nФирма с наибольшей прибылью: " + mostProfitableFirm);

        // Удалить обанкротившуюся фирму (например, с прибылью < 0)
        firms.removeIf(firm -> firm.profit < 0);


        // Добавить новую фирму
        firms.add(new TouristFirm("NewTravel", 2023, "0000000000", 75000));
        System.out.println("\nСписок фирм после добавления новой и удаления обанкротившейся:");
        firms.forEach(System.out::println);
    }

    //Методы для работы с коллекцией
    static void findFirmInfo(Collection<TouristFirm> firms, String firmName) {
        for (TouristFirm firm : firms) {
            if (firm.name.equals(firmName)) {
                System.out.println("\nИнформация о фирме " + firmName + ":");
                System.out.println("ИНН: " + firm.getINN());
                System.out.println("Прибыль: " + firm.getProfit());
                return;
            }
        }
        System.out.println("\nФирма " + firmName + " не найдена.");
    }

    static double calculateTotalProfit(Collection<TouristFirm> firms) {
        return firms.stream().mapToDouble(TouristFirm::getProfit).sum();
    }

    static TouristFirm findMostProfitableFirm(Collection<TouristFirm> firms) {
        return Collections.max(firms, Comparator.comparingDouble(TouristFirm::getProfit));
    }
}

