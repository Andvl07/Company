package Cars;

import java.util.ArrayList;
import java.util.List;

class Car {
    String brand;
    String model;
    String carNumber;

    public Car(String brand, String model, String carNumber) {
        this.brand = brand;
        this.model = model;
        this.carNumber = carNumber;
    }

    public void start() {
        System.out.println("Машина " + brand + " " + model + " завелась.");
    }

    public void stop() {
        System.out.println("Машина " + brand + " " + model + " остановилась.");
    }
}

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "5 GT F07", "Х990АМ48"));
        cars.add(new Car("Audi", "A6 C7", "М309РН73"));
        cars.add(new Car("LADA", "Granta", "Н481РА25"));

        for (Car car : cars) {
            car.start();
            car.stop();
            System.out.println();
        }
    }
}

