package LegacyCollection;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Sandy");
        names.push("Dwi");
        names.push("Handoko");

        for (var name = names.pop(); name != null; name = names.pop()) {
            System.out.println(name);
        }
    }
}
