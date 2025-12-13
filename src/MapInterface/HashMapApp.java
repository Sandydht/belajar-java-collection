package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("firstName", "Sandy");
        map.put("middleName", "Dwi");
        map.put("lastName", "Handoko");

        System.out.println(map.get("firstName"));
        System.out.println(map.get("middleName"));
        System.out.println(map.get("lastName"));
    }
}
