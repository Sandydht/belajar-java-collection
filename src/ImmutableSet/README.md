# Immutable Set
- Sama seperti List, Set pun memiliki tipe data immutable.
- Cara pembuatan immutable Set di Java mirip dengan pembuatan immutable List.

## Membuat Immutable Set
| Method | Keterangan |
|--------|------------|
| Collections.emptySet() | Membuat immutable set kosong |
| Collections.singleton(e) | Membuat immutable set berisi 1 element |
| Collections.unmodifiedSet(set) | Mengubah mutable set menjadi immutable |
| Set.of(e...) | Membuat immutable set dari element-element |
- Kode: Immutable Set
```java
import java.util.Set;

public static void main(String[] args) {
    Set<String> names = Set.of("Sandy", "Dwi", "Handoko");
    
    names.add("Sandy"); // error
    names.remove("Sandy"); // error
}
```