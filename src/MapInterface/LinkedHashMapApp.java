package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("Sandy", "Sandy");
        map.put("Dwi", "Dwi");
        map.put("Handoko", "Handoko");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}
