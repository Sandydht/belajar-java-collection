package DequeInterface;

import java.util.Deque;
import java.util.LinkedList;

public class DequeInterfaceApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Sandy");
        stack.offerLast("Dwi");
        stack.offerLast("Handoko");

        for (var item = stack.pollLast(); item != null; item = stack.pollLast()) {
            System.out.println(item);
        }
    }
}
