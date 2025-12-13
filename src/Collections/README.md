# Collections Class
- Collections adalah class yang berisikan utility static method untuk membantu kita menggunakan Java Collection.
- Di materi-materi sebelumnya kita sudah bahas beberapa, seperti membuat immutable collection.
- Namun sebenarnya masih ada banyak static method yang bisa kita gunakan di class Collections.
- [Dokumentasi Collections](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Collections.html)

## Static Method di Collections Class
| Method                                          | Keterangan |
|-------------------------------------------------|------------|
| void copy(listTo, listFrom)                     | Copy semua data dari listFrom ke listTo |
| int frequency(collection, object)               | Mengambil berapa banyak element yang sama dengan object |
| max(collection) dan max(collection, comparator) | Mengambil element paling tinggi di list |
| min(collection) dan min(collection, comparator) | Mengambil element paling kecil di list |
| void reverse(list) | Membalikkan seluruh element di list |
| void shuffle(list) | Mengacak posisi element di list |
| void swap(list, from, to) | Menukar posisi from ke to di list |
| ...dan masih banyak | |
- Kode: Collections Class
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static void main(String[] args) {
    List<String> names = new ArrayList<>();

    names.addAll(List.of("Sandy", "Dwi", "Handoko", "Trapsilo"));
    System.out.println(names);

    Collections.reverse(names);
    System.out.println(names);
    
    Collections.shuffle(names);
    System.out.println(names);
}
```


