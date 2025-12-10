package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // List<String> names = new LinkedList<>();

        names.add("Sandy");
        names.add("Dwi");
        names.add("Handoko");
        names.add("Trapsilo");

        names.set(0, "Software Engineer");

        System.out.println(names.get(0));
        System.out.println(names.get(1));
    }
}
