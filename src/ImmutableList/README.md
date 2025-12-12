# Immutable List
- Secara default, List di Java baik itu ArrayList ataupun LinkedList datanya bersifat mutable (Bisa diubah).
- Di Java mendukung pembuatan Immutable List, artinya datanya tidak bisa diubah lagi.
- Sekali List dibuat, datanya tidak bisa diubah lagi, alias final.
- Tapi ingat, data list nya yang tidak bisa diubah, bukan reference object element nya. Kalo misal kita membuat Immutable List berisikan data Person, field data Person tetap bisa diubah, tapi isi elemen dari Immutable List tidak bisa diubah lagi.
- Ini cocok ketika kasus - kasus misal, tidak sembarangan code yang boleh mengubah element di List.
- Kode: Problem Mutable List
```java
import java.util.ArrayList;

public static class Person {
    private String name;
    private List<String> hobbies = new ArrayList<>();
    
    public Person(String name) {
        this.name = name;
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public List<String> getHobbies() {
        return hobbies;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}

public static void main(String[] args) {
    Person person = new Person("Sandy Dwi Handoko Trapsilo");

    person.addHobby("Music");
    person.addHobby("Programming");
    person.addHobby("Riding");

    doSomethingWithHobbies(person.getHobbies());

    System.out.println(person.getName());
    System.out.println(person.getHobbies());
}

public static void doSomethingWithHobbies(List<String> hobbies) {
    hobbies.add("Reading");
}
```

## Membuat Immutable List
| Method | Keterangan |
|--------|------------|
| Collections.emptyList() | Membuat immutable list kosong |
| Collections.singletonList(e) | Membuat immutable list berisi 1 element |
| Collections.unmodifiableList(list) | Mengubah mutable list menjadi immutable | 
| List.of(e...) | Membuat immutable list dari element - element |
- Kode: Immutable List
```java
import java.util.Collections;
import java.util.List;

public static void main(String[] args) {
    List<String> one = Collections.singletonList("Satu");
    List<String> empty = Collections.emptyList();
    List<String> mutable = new ArrayList<>();

    mutable.add("Sandy");
    mutable.add("Dwi");

    List<String> immutable = Collections.unmodifiableList(mutable);
    List<String> elements = List.of("Sandy", "Dwi", "Handoko", "Trapsilo");

    // immutable.add("Programmer"); // error

    System.out.println(one);
    System.out.println(empty);
    System.out.println(immutable);
    System.out.println(elements);
}
```