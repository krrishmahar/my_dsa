package Java_DSA.OOPs2;

import java.util.Stack;

public class StackIng {
    static void main() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1); //O(1)
        stack.push(3); //O(n) to duplicate since depends on capacity like ArrayList
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(11);
//        System.out.println(stack);
        System.out.println(stack.peek()); //O(1)
        System.out.println(stack.pop()); //O(1)
        System.out.println(stack.peek());
        for (Integer num : stack){
            System.out.print(num + " ");
        }
    }
}
