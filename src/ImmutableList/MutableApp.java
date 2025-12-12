package ImmutableList;

import data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Sandy Dwi Handoko Trapsilo");

        person.addHobby("Music");
        person.addHobby("Programming");
        person.addHobby("Riding");

        doSomethingWithHobbies(person.getHobbies());

        System.out.println(person.getName());
        for (String hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Reading");
    }
}
