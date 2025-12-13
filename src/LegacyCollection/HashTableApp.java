package LegacyCollection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("firstName", "Sandy");
        map.put("middleName", "Dwi");
        map.put("lastName", "Handoko");

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
