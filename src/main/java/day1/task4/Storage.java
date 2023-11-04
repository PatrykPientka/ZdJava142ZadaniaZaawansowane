package day1.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {
    private Map<String, List<String>> storage ;

    public Storage() {
        storage = new HashMap<>();
    }

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("0", "value0_1");
        storage.addToStorage("1", "value1_1");
        storage.addToStorage("2", "value2_1");
        storage.addToStorage("2", "value2_2");
        storage.addToStorage("3", "value3_1");
        storage.addToStorage("4", "value0_1");

        storage.printValues("2");

        List<String> keys = storage.findKeysByStream("value0_1");
        System.out.println(keys);

        List<String> keys1 = storage.findKeysByForEach("value0_1");
        System.out.println(keys);
    }

   public void addToStorage(String key, String value){
        if(storage.containsKey(key)){
            //modify value
            List<String> values = storage.get(key);
            values.add(value);
            storage.put(key, values);
        }else{
            //add new key value
            List<String> values = new ArrayList<>();
            values.add(value);
            storage.put(key, values);
        }
    }

   public void printValues(String key){
       System.out.println(storage.get(key));
   }


   //przy uzyciu streama
   public List<String> findKeysByStream(String searchedValue){
       return storage.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(searchedValue))
                .map(Map.Entry :: getKey)
                .toList();
   }
   //przy uzyciu foreach
    public List<String> findKeysByForEach(String searchedValue){
        List<String> listOfKeys = new ArrayList<>();
        //for (Map.Entry<String, List<String>> entry:storage.entrySet())
         for (var entry:storage.entrySet()){
            if(entry.getValue().contains(searchedValue)){
                listOfKeys.add(entry.getKey());
            }else {

            }
        }
         return listOfKeys;
    }
}
