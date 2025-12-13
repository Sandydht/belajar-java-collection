package LegacyCollection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> names = new Vector<>();

        names.add("Sandy");
        names.add("Dwi");
        names.add("Handoko");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
