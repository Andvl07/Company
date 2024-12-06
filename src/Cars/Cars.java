package Cars;


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



