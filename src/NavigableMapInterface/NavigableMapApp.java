package NavigableMapInterface;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Sandy", "Sandy");
        map.put("Budi", "Budi");
        map.put("Nugraha", "Nugraha");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Sandy"));
        System.out.println(map.higherKey("Sandy"));

        NavigableMap<String, String> mapDesc = map.descendingMap();

        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        // immutable.put("Joko", "Joko"); // error

        System.out.println(empty);
        System.out.println(immutable);
    }
}
