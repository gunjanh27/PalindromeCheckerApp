import java.util.*;
public class PalindromeCheckerApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== Palindrome Checker App ====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        PalindromeService palindromeService = new PalindromeService();
        boolean result = palindromeService.checkPalindrome(input);
        if (result) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
        scanner.close();
    }
}
class PalindromeService {
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
