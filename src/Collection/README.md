# Collection Interface
- Selain iterable interface, parent class semua collection di Java adalah Collection.
- Kalo iterable interface digunakan sebagai kontrak untuk mengiterasi data secara sequential.
- Collection merupakan kontrak untuk memanipulasi data collection, seperti menambah, menghapus, dan mengecek isi data collection.
- Tidak ada direct implementation untuk Collection, karena collection nanti akan dibagi lagi menjadi List, Set, dan Queue.
- Kode: Menambah Data ke Collection
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public static void main(String[] args) {
    Collection<String> names = new ArrayList<>();
    names.add("Sandy");
    names.add("Dwi");
    names.add("Handoko");
    names.add("Trapsilo");
    names.addAll(Arrays.asList("Sandy", "Dwi", "Handoko", "Trapsilo"));
    
    for (var name : names) {
        System.out.println(name);
    }
}
```
- Kode: Mengecek Data di Collection
```java
import java.util.Arrays;

public static void main(String[] args) {
    Collection<String> names = new ArrayList<>();
    names.addAll(Arrays.asList("Sandy", "Dwi", "Handoko", "Trapsilo"));

    System.out.println(names.contains("Sandy"));
    System.out.println(names.containsAll(Arrays.asList("Sandy", "Handoko")));
    
    names.remove("Sandy");
    names.removeAll(Arrays.asList("Handoko", "Trapsilo"));

    System.out.println(names.contains("Sandy"));
    System.out.println(names.containsAll(Arrays.asList("Sandy", "Handoko")));
}
```