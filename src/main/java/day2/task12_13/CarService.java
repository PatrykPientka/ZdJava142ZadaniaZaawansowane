package day2.task12_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    //dodawanie samochodow do listy
    public void add(Car car) {
        cars.add(car);
    }

    public List<Car> getAll() {
        //return cars; //bedziemy caly czas operowac na kolekcji cars- bardzo niebezpieczne
        //return List.copyOf(cars); // zrobienie kopii cars ale jako niemodyfikowalna liste

        return new ArrayList<>(cars); // nowa modyfikowalna lista samochodow

    }

    public void remove(Car car) {
        cars.remove(car);
    }

    public List<Car> getAllCarsWithV12Engine() {
        return cars.stream()
                .filter(car -> car.getEngingeType().equals(EngineType.V12))
                .toList();
    }

    public List<Car> getAllCarsManufacutredBefore1999(){
        return cars.stream()
                .filter(car -> car.getProductionYear()< 1999)
                .toList();
    }

    public Car getCheapestCar(List<Car> cars){
        return cars.stream()
                .min(Comparator.comparingDouble(Car::getPrice))
                .get();

    }

    public List<Car> getCarsProducedBy(Manufacturer manufacturer){
        return cars.stream()
                .filter(car-> car.getManufacturers().contains(manufacturer))
                .toList();
    }
}