# Default Method
- Di Java 8 ada fitur bernama Default Method, dimana kita bisa menambahkan konkrit method di interface.
- Fitur ini banyak sekali digunakan di Java Collection, karena kita tahun semua collection di Java memiliki kontrak interface, sehingga dengan mudah di Java bisa meng-improve kemampuan semua collection hanya dengan menambahkan default method di interface collection-nya.

## Default Method di Collection
| Default Method | Keterangan |
|----------------|------------|
| Iterable.forEach(consumer) | Melakukan iterasi seluruh data collection. |
| List.removeIf(predicate) | Menghapus data di collection menggunakan predicate. |
| List.replaceAll(operator) | Mengubah seluruh data di collection. |

- Kode: Default Method Collection
```java
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();

    for (int i = 1; i <= 100; i++) {
        numbers.add(i);
    }

    System.out.println(numbers);

    numbers.replaceAll(new UnaryOperator<Integer>() {
        @Override
        public Integer apply(Integer integer) {
            return integer * 10;
        }
    });

    System.out.println(numbers);

    numbers.forEach(new Consumer<Integer>() {
        @Override
        public void accept(Integer integer) {
            System.out.println(integer);
        }
    });

    System.out.println(numbers);

    numbers.removeIf(new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            return integer > 500;
        }
    });

    System.out.println(numbers);
}
```

## Default Method di Map
| Default Method | Keterangan |
|----------------|------------|
| getOrDefault(key, defaultValue) | Mengambil data berdasarkan key, jika tidak ada, return defaultValue |
| forEach(consumer) | Melakukan iterasi seluruh data key-value |
| replaceAll(function) | Mengubah seluruh data value |
| putIfAbsent(key, value) | Simpan data ke map jika belum ada |
| remove(key, value | Hapus jika key-value nya sama |
| replace(key, oldValue, newValue) | Ubah key jika value sekarang sama dengan oldValue |
| computeIfAbsent(key, function) | Ubah key dengan value hasil function jika belum ada |
| computeIfPresent(key, function | Ubah key dengan value hasil function jika sudah ada |
| ... dan masih banyak | |
- Kode: Default Method Map
```java
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    map.put("Sandy", "Sandy");
    map.put("Dwi", "Dwi");
    map.put("Handoko", "Handoko");

    map.forEach(new BiConsumer<String, String>() {
        @Override
        public void accept(String key, String value) {
            System.out.println(key + " : " + value);
        }
    });
}
```