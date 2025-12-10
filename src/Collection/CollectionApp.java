package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Sandy");
        names.add("Dwi");
        names.add("Handoko");
        names.add("Trapsilo");
        names.addAll(Arrays.asList("Sandy", "Dwi", "Handoko", "Trapsilo"));

        for (var name : names) {
            System.out.println(name);
        }

        System.out.println(names.contains("Sandy"));
        System.out.println(names.containsAll(Arrays.asList("Sandy", "Handoko")));

        names.remove("Sandy");
        names.removeAll(Arrays.asList("Handoko", "Trapsilo"));

        System.out.println(names.contains("Sandy"));
        System.out.println(names.containsAll(Arrays.asList("Sandy", "Handoko")));
    }
}
