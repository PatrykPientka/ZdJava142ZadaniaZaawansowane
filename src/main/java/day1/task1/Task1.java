package day1.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> unsorted = List.of("a","b" , "c", "d");
        List<String> sorted = sortUsingAnonymousClass(unsorted);
        List<String> sorted2 = sortUsingOwnComparator(unsorted);
        List<String> sorted3 = sortUsingLambda(unsorted);
        List<String> sorted4 = sortUsingReverseOrder(unsorted);
        List<String> sorted5 = sortOnList(unsorted);
        List<String> sorted6 = sortUsingStream(unsorted);
        System.out.println(sorted);
        System.out.println(sorted2);
        System.out.println(sorted3);
        System.out.println(sorted4);
        System.out.println(sorted5);
        System.out.println(sorted6);
    }

    public static List<String> sortUsingAnonymousClass(List<String> unsorted){
        List<String > sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o2.compareTo(o1);
            }
        });
        return sorted;
    }

    public static List<String> sortUsingOwnComparator(List<String> unsorted){
        List<String > sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new OwnSortComparator());
        return sorted;
    }

    public static List<String> sortUsingLambda(List<String> unsorted){
        List<String > sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted,(o1, o2) -> o2.compareTo(o1));
        return sorted;
    }
    public static List<String> sortUsingReverseOrder(List<String> unsorted){
        List<String > sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, Comparator.reverseOrder());
        return sorted;
    }

    public static List<String> sortOnList(List<String> unsorted){
        List<String > sorted = new ArrayList<>(unsorted);
        sorted.sort(Comparator.reverseOrder());
        return sorted;
    }
    public static List<String> sortUsingStream(List<String> unsorted){
        List<String > sortedCollections = new ArrayList<>(unsorted);

        return sortedCollections.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
