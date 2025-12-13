# Entry Interface 
- Saat kita menyimpan data di Map, data disimpan dalam pair (key-value).
- Di Java collection, implementasi Pair di Map bernama entry.
- Entry adalah interface sederhana yang berisikan method untuk mengambil key dan value.
- Kode: Menggunakan Entry

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    map.put("Sandy", "Sandy");
    map.put("Budi", "Budi");
    map.put("Nugraha", "Nugraha");

    Set<Map.Entry<String, String>> entries = map.entrySet();
    
    for (var entry : entries) {
        System.out.println("=====");
        System.out.println("Key: " + entry.getKey());
        System.out.println("Value: " + entry.getValue());
    }
}
```