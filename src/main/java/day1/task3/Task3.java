package day1.task3;

import java.security.Key;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> newMap = Map.of("Java", 18, "Python", 1);
       // printMap(newMap);
        print(newMap);
    }
    // 1 przyklad metody
    public static void print(Map<String, Integer> input){
        int count = 0;
        for (Map.Entry<String, Integer>entry: input.entrySet() ) {
            count++;
            if( count == input.size()){
            System.out.println("Klucz " + entry.getKey() + ", Wartosc: "  + entry.getValue() + ".");

            }else {
                System.out.println("Klucz " + entry.getKey() + ", Wartosc: "  + entry.getValue() + ",");

            }
        }
    }
    // drugi przyklad rozwiazania
    public static void printMap(Map<String, Integer> inputMap){
        int mapSize = inputMap.size();
        int count = 0;
        for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.print("Klucz: " + key + ", Wartość: " + value);

            count++;
            if (count < mapSize) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();  // Nowa linia na końcu
    }
    // rozwiazanie uzywajac streama
    public static void printUsingStream(Map<String, Integer> input){
        String list = input.entrySet()
                .stream()
                .map(entry -> " Klucz: " + entry.getKey() + ", Wartosc: " + entry.getValue())
                .collect(Collectors.joining(", \n","", "."));
        System.out.println(list);

    }
}
