package SortedMapInterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterfaceApp {
    public static void main(String[] args) {
        SortedMap<String, String> map = new TreeMap<>();

        map.put("Sandy", "Sandy");
        map.put("Budi", "Budi");
        map.put("Joko", "Joko");

        for (var key : map.entrySet()) {
            System.out.println(key);
        }

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("Sandy", "Sandy");
        sortedMap.put("Budi", "Budi");
        sortedMap.put("Joko", "Joko");

        for (var key : sortedMap.entrySet()) {
            System.out.println(key);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

        // immutable.put("Nugraha", "Nugraha"); // error
    }
}
