package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.addAll(List.of("Sandy", "Dwi", "Handoko", "Budi"));

        Collections.sort(names);
        System.out.println(names);

        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(names, reverse);
        System.out.println(names);
    }
}
