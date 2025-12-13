package MapInterface;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {
        String key1 = "name.first";

        String name = "name";
        String first = "first";

        String key2 = name + "." + first;

        Map<String, String> map = new IdentityHashMap<>();

        map.put(key1, "Sandy Dwi Handoko Trapsilo");
        map.put(key2, "Sandy Dwi Handoko Trapsilo");

        System.out.println(map.size());
    }
}
