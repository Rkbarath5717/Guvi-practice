import java.util.*;
public class stackProblems {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.empty());
        System.out.println(stack.search(20));
        stack.push(70);
        System.out.println(stack);
        System.out.println(stack.remove(2));
        System.out.println(stack.remove(Integer.valueOf(10)));
        System.out.println(stack.firstElement());
        System.out.println(stack.lastElement());
        System.out.println(stack.get(3));
        System.out.println(stack.set(3,40));
        System.out.println(stack);
        stack.clear();
        System.out.println(stack.empty());
        System.out.println(stack.peek());
    }
}