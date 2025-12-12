package ImmutableSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Satu");

        Set<String> mutable = new HashSet<>();
        mutable.add("Sandy");
        mutable.add("Dwi");
        mutable.add("Handoko");

        Set<String> immutable = Collections.unmodifiableSet(mutable);

        System.out.println(empty);
        System.out.println(one);
        System.out.println(mutable);
        System.out.println(immutable);
    }
}
