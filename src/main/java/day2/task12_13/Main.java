package day2.task12_13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        Manufacturer volvo = new Manufacturer("Volvo", 1930, "Sweden");
        Car XC90 = new Car("XC90", "XC90", 400_000, 2023, List.of(volvo), EngineType.V8);
        Car XC60 = new Car("XC60", "XC60", 200_000, 2022, List.of(volvo), EngineType.V6);

        carService.add(XC90);
        carService.add(XC60);


    }
}
