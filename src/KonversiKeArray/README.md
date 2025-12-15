# Collection Interface
- Interface Collection memiliki method toArray() untuk melakukan konversi collection ke Array.
- Ini sangat cocok jika kita ingin mengubah collection ke Array, misal saja karena mau memanggil method yang memang parameternya bertipe array, bukan collection.

## toArray Method di Collection
| Method | Keterangan |
|--------|------------|
| Object[] toArray() | Mengubah collection menjadi array |
| T[] toArray(T[]) | Mengubah collection menjadi array T |
- Kode: Konversi ke Array
```java
import java.util.Arrays;
import java.util.List;

public static void main(String[] args) {
    List<String> names = List.of("Sandy", "Dwi", "Handoko");

    Object[] objects = names.toArray();
    String[] strings = names.toArray(new String[]{});

    System.out.println(Arrays.toString(objects));
    System.out.println(Arrays.toString(strings));
}
```