package IterableDanIteratorInterface;

import java.util.Iterator;
import java.util.List;

public class IterableDanInteratorInterfaceApp {
    public static void main(String[] args) {
        System.out.println("ITERABLE");
        Iterable<String> names = List.of("Sandy", "Dwi", "Handoko", "Trapsilo");

        for (var name : names) {
            System.out.println(name);
        }

        System.out.println("ITERATOR");
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
