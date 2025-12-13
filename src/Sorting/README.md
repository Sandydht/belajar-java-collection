# Sorting
- Sorting atau pengurutan adalah algoritma yang sudah biasa kita lakukan.
- Di Java Collection juga sudah disediakan cara untuk melakukan pengurutan, jadi kita tidak perlu melakukan pengurutan secara manual.
- Namun perlu diingat, yang bisa di sort hanyalah List, karena Set, Queue, Deque, dan Map cara kerjanya sudah khusus, jadi pengurutan hanya bisa dilakukan di List.

## Sorting di List
| Method                 | Keterangan                                          |
|------------------------|-----------------------------------------------------|
| Collections.sort(list) | Mengurutkan list dengan comparable bawaan element.  |
| Collections.sort(list, comparator) | Mengurutkan list dengan comparator. |
- Kode: Sorting List

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public static void main(String[] args) {
    List<String> names = new ArrayList<>();

    names.addAll(List.of("Sandy", "Dwi", "Handoko"));

    Collections.sort(names);
    System.out.println(names);

    Collections.sort(names, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    });
}
```