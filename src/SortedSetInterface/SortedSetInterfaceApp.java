package SortedSetInterface;

import data.Person;
import data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterfaceApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("Sandy"));
        people.add(new Person("Dwi"));
        people.add(new Person("Handoko"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        // sortedSet.add(new Person("Trapsilo")); // error
        System.out.println(sortedSet);
    }
}
