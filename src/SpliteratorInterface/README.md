# Spliterator Interface
- Spliterator adalah interface yang bisa digunakan untuk melakukan partisi data collection.
- Biasanya ini digunakan ketika kita akan memproses collection dalam jumlah besar, lalu agar lebih cepat di split menjadi beberapa dan diproses secara paralel agar lebih cepat.
- Penggunakan Spliterator biasanya erat kaitannya dengan Java Thread atau Java Concurrency, namun di materi ini kita tidak akan membahas tentang itu, lebih fokus ke Spliterator.
- Kode: Spliterator
```java
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public static void main(String[] args) {
    List<String> names = List.of("Sandy", "Dwi", "Handoko", "Trapsilo");

    Spliterator<String> spliterator1 = names.spliterator();
    Spliterator<String> spliterator2 = spliterator1.trySplit();

    System.out.println(spliterator1.estimateSize());
    System.out.println(spliterator2.estimateSize());

    spliterator1.forEachRemaining(new Consumer<String>() {
        @Override
        public void accept(String s) {
            System.out.println(s);
        }
    });
}
```