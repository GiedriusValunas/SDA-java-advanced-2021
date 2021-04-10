package Collections;

import java.util.Stack;

public class Numbers {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(7);// position 5
        stack.push(33);// position 4
        stack.push(4);// position 3
        stack.push(9);// position 2
        stack.push(18);// position 1

        System.out.println(stack);

        System.out.println("=============");

        System.out.println(stack.peek());

        System.out.println(stack.pop()); // removes form top
        System.out.println("=============");

        for (Integer num : stack) {
            System.out.println(num);
        }
        System.out.println("=============");

        boolean contains = stack.contains(33);
        if (contains) {
            Integer position = stack.search(33);
            System.out.println("33 found at position: " + position);
        }

        System.out.println(stack.search(7));


    }
}
