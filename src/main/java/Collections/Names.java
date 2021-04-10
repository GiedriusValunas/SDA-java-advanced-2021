package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Names {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Smith");
        queue.add("John");
        queue.add("Marry");
        queue.add("Brigit");

        System.out.println(queue);

        System.out.println(queue.size());

        System.out.println(queue.peek());

        System.out.println(queue.remove());

        System.out.println(queue);

        //methods won't trigger error
//        queue.offer("Cline");
//        queue.poll();

        for (String name : queue) {
            System.out.println(name);
        }

    }
}
