import java.util.*;
public class PalindromeCheckerApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "madam";
        long start1 = System.nanoTime();
        boolean result1 = checkUsingStack(input);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        boolean result2 = checkUsingDeque(input);
        long end2 = System.nanoTime();
        long stackTime = end1 - start1;
        long dequeTime = end2 - start2;
        System.out.println("Stack Result: " + result1);
        System.out.println("Stack Time (ns): " + stackTime);
        System.out.println("Deque Result: " + result2);
        System.out.println("Deque Time (ns): " + dequeTime);
    }
    public static boolean checkUsingStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkUsingDeque(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}