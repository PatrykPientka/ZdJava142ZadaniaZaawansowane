package day1.task1;

import java.util.Comparator;

public class OwnSortComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
