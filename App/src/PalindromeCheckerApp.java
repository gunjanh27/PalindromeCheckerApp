import java.util.*;
public class PalindromeCheckerApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Choose strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        int choice = scanner.nextInt();
        PalindromeStrategy strategy;
        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }
        boolean result = strategy.check(input);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        scanner.close();
    }
}
interface PalindromeStrategy {
    boolean check(String input);
}
class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
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
}
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {
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