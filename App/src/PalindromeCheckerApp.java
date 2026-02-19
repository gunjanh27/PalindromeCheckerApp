public class PalindromeCheckerApp {
    public static void main (String[] args){
        String original = "madam";

        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is NOT a palindrome.");
        }

    }
}
