package ImmutableMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Sandy");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Sandy");

        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> name = Map.of(
                "firstName", "Sandy",
                "middleName", "Dwi",
                "lastName", "Handoko"
        );

        // name.put("middleName", "Ups"); // error

        System.out.println(empty);
        System.out.println(singleton);
        System.out.println(mutable);
        System.out.println(immutable);
    }
}
