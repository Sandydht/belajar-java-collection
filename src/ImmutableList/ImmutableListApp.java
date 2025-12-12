package ImmutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();
        List<String> mutable = new ArrayList<>();

        mutable.add("Sandy");
        mutable.add("Dwi");

        List<String> immutable = Collections.unmodifiableList(mutable);
        List<String> elements = List.of("Sandy", "Dwi", "Handoko", "Trapsilo");

        // immutable.add("Programmer"); // error

        System.out.println(one);
        System.out.println(empty);
        System.out.println(immutable);
        System.out.println(elements);
    }
}
