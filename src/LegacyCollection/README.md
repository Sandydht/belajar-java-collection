# Legacy Collection
- Collection sudah ada sejak Java versi 1, namun semakin kesini, Java Collection semakin berkembang.
- Sebenarnya ada beberapa legacy collection (collection jadul) yang belum kita bahas, namun jarang sekali digunakan sekarang ini.

## Vector Class
- Vector class adalah implementasi dari interface List.
- Cara kerja Vector mirip dengan ArrayList, yang membedakkan adalah semua method di Vector menggunakan kata kunci synchronized yang artinya dia thread safe.
- Namun problemnya adalah, karena semua method menggunakan kata kunci synchronized, secara otomatis impact-nya ke performance yang menjadi lambat dibandingkan menggunakan ArrayList.
- Lantas bagaimana jika kita ingin membuat List yang bisa digunakan di proses paralel ? Di versi Java baru, sudah disediakan yang lebih canggih untuk itu, oleh karena itu penggunaan Vector sudah jarang sekali ditemui sekarang.
- Kode: Vector
```java
import java.util.List;
import java.util.Vector;

public static void main(String[] args) {
    List<String> names = new Vector<>();
    
    names.add("Sandy");
    names.add("Handoko");
    names.add("Trapsilo");
    
    for (var name : names) {
        System.out.println(name);
    }
}
```

## HashTable Class
- HashTable adalah implementasi dari Map yang mirip dengan HashMap.
- Sama seperti Vector, semua method di HashTable memiliki kata kunci synchronized, sehingga performannya lebih lambat dibandingkan HashMap.
- Dan karena di versi Java baru sudah ada juga ConcurrentHashMap, sehingga penggunaan HashTable sudah jarang sekali ditemui.
- Kode: HashTable
```java
import java.util.Hashtable;
import java.util.Map;

public static void main(String[] args) {
    Map<String, String> map = new Hashtable<>();

    map.put("firstName", "Sandy");
    map.put("middleName", "Dwi");
    map.put("lastName", "Handoko");
    
    for (var entry : map.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}
```

## Stack Class
- Stack adalah implementasi struktur data tumpukan LIFO (Last In First Out).
- Namun fitur yang lebih komplit dan konsisten sudah disediakan di Deque, jadi tidak ada alasan lagi menggunakan class Stack.
- Kode: Stack
```java
import java.util.Stack;

public static void main(String[] args) {
    Stack<String> names = new Stack<>();
    
    names.push("Sandy");
    names.push("Dwi");
    names.push("Handoko");
    
    for (var name = names.pop(); name != null; name = names.pop()) {
        System.out.println(name);
    }
}
```