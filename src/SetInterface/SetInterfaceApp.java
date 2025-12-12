package SetInterface;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterfaceApp {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Sandy");
        names.add("Dwi");
        names.add("Handoko");

        System.out.println("HashSet");
        for (String name : names) {
            System.out.println(name);
        }

        Set<String> linkedNames = new LinkedHashSet<>();

        linkedNames.add("Sandy");
        linkedNames.add("Dwi");
        linkedNames.add("Handoko");

        System.out.println("LinkedHashSet");
        for (String name : linkedNames) {
            System.out.println(name);
        }

        // EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE);

        for (Enum gender : genders) {
            System.out.println(gender);
        }
    }

    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }
}
