public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String appName = "PalindromeChecker App";
        String version = "Version 1.0";

        System.out.println("=================================");
        System.out.println("Welcome to the " + appName + "!");
        System.out.println(version);
        System.out.println("=================================");

        System.out.println("Application is ready to check palindromes.");

        // -------- UC2: Hardcoded Palindrome Check --------
        String word = "madam";   // hardcoded string

        if (word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println("UC2 Result: \"" + word + "\" is a Palindrome");
        } else {
            System.out.println("UC2 Result: \"" + word + "\" is NOT a Palindrome");
        }
        // ------------------------------------------------
    }
}