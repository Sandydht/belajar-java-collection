package NavigableSetInterface;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetInterfaceApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Sandy", "Dwi", "Handoko", "Trapsilo"));

        NavigableSet<String> namesDesc = names.descendingSet();
        NavigableSet<String> handoko = namesDesc.headSet("Handoko", true);

        for (var name : names) {
            System.out.println(name);
        }
        System.out.println(handoko);

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("Programmer"); // error

        System.out.println(immutable);
    }
}
