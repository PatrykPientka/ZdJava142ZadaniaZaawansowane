package day2.task12_13;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    //dodawanie samochodow do listy
    public void add(Car car){
        cars.add(car);
    }

    public List<Car> getAll(){
        //return cars; //bedziemy caly czas operowac na kolekcji cars- bardzo niebezpieczne
        //return List.copyOf(cars); // zrobienie kopii cars ale jako niemodyfikowalna liste

        return new ArrayList<>(cars); // nowa modyfikowalna lista samochodow

    }



}
