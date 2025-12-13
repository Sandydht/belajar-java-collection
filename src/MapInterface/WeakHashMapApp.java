package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new WeakHashMap<>(); // data yang tidak dipakai akan dihapus jika garbage collection nyala
        // Map<Integer, Integer> map = new HashMap<>(); // data yang tidak dipakai tidak akan dihapus jika garbage collection nyala

        for (int i = 0; i < 1000000; i++) {
            map.put(i, i);
        }

        System.gc();

        System.out.println(map.size());
    }
}
