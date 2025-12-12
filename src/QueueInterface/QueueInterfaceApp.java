package QueueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterfaceApp {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>(10);

        queue.offer("Sandy");
        queue.offer("Dwi");
        queue.offer("Handoko");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
