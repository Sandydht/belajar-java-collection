package AbstractCollection;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();

        queue.offer("Sandy");
        queue.offer("Dwi");
        queue.offer("Handoko");

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}
