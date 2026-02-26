import java.util.LinkedList;
public class PalindromeCheckerApp {
    public static void main (String[] args){
        String input = "level";
        System.out.println("Input : " + input);
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()) {
            list.add(c);
        }
        boolean isPalindrome = true;
        while (list.size() > 1) {
            Character first = list.removeFirst();
            Character last = list.removeLast();
            if (!first.equals(last)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

