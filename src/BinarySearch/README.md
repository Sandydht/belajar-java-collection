# Binary Search
- Secara default List di Java memiliki fitur search atau get data, namun implementasinya menggunakan sequential search, artinya data akan di cek satu per satu dari awal.
- Salah satu algoritma pencarian yang populer adalah binary search, namun binary search hanya bisa dilakukan jika datanya telah berurutan.
- Untungnya di Java Collection sudah ada implementasi binary search, sehingga kita tidak perlu membuatnya secara manual.

## Binary Search di List
| Method | Keterangan |
|--------|------------|
| Collections.binarySearch(list, value) | Mencari menggunakan binary search |
| Collections.binarySearch(list, value, comparator) | Mencari menggunakan binary search dengan bantuan comparator |
- Kode: Binary Search di List
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < 1000; i++) {
        numbers.add(i);
    }

    int index = Collections.binarySearch(numbers, 500);
    System.out.println(index);
}
```