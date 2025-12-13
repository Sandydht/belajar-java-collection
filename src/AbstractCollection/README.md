# Abstract Collection
- Struktur data collection di Java selalu berkembang, namun biasanya algoritma dasarnya selalu sama antar jenis collection.
- Hampir semua interface collection di Java sudah disediakan abstract class-nya sebagai dasar algoritma-nya, dan hampir semua implementasi class konkrit-nya selalu extends abstract class collection.
- Hal ini mempermudah kita, jika ingin membuat collection manual, kita tidak perlu membuat dari awal, kita bisa menggunakan abstract class yang sudah disediakan.

## Abstract Class
| Abstract Class | Untuk |
|----------------|-------|
| AbstractCollection | Collection |
| AbstractList | List |
| AbstractMap | Map |
| AbstractQueue | Queue |
| AbstractSet | Set |
- Kode: Membuat Single Queue
```java
import java.util.AbstractQueue;
import java.util.Collections;

public class SingleQueue<E> extends AbstractQueue<E> {
    private E data;

    @Override
    public Iterator<E> iterator() {
        return Collections.singleton(data).iterator();
    }
    
    @Override
    public int size() {
        return data == null ? 0 : 1;
    }
}
```
- Kode: Menggunakan Single Queue
```java
import AbstractCollection.SingleQueue;

import java.util.Queue;

public static void main(String[] args) {
    Queue<String> queue = new SingleQueue<>();
    
    queue.offer("Sandy");
    queue.offer("Dwi");
    queue.offer("Handoko");

    System.out.println(queue.size());
    System.out.println(queue.peek());
    System.out.println(queue.poll());
}
```