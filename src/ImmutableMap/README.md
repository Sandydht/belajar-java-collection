# Immutable Map
- Sama seperti List dan Set, Map pun punya tipe data immutable.

## Membuat Immutable Map
| Method | Keterangan |
|--------|------------|
| Collections.emptyMap() | Membuat immutable map kosong |
| Collections.unmodifiableMap(map) | Mengubah mutable map menjadi immutable |
| Collections.singletonMap(key, value) | Membuat map dengan satu jumlah key-value |
| Map.of(...) | Membuat immutable map dari key-value |
- Kode: Immutable Map
```java
import java.util.Map;

public static void main(String[] args) {
    Map<String, String> name = Map.of(
            "firstName", "Sandy",
            "middleName", "Dwi",
            "lastName", "Handoko"
    );
    
    name.put("middleName", "Ups"); // error
}
```