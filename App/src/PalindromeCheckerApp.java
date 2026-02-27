public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String appName = "PalindromeChecker App";
        String version = "Version 1.0";

        System.out.println("=================================");
        System.out.println("Welcome to the " + appName + "!");
        System.out.println(version);
        System.out.println("=================================");

        System.out.println("Application is ready to check palindromes.");

        // ================= UC2 =================
        // Hardcoded palindrome check
        String uc2Word = "madam";

        if (uc2Word.equals(new StringBuilder(uc2Word).reverse().toString())) {
            System.out.println("UC2 Result: \"" + uc2Word + "\" is a Palindrome");
        } else {
            System.out.println("UC2 Result: \"" + uc2Word + "\" is NOT a Palindrome");
        }
        // =======================================


        // ================= UC3 =================
        // Palindrome check by reversing using loop
        String original = "level";   // hardcoded string for UC3
        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("UC3 Result: \"" + original + "\" is a Palindrome");
        } else {
            System.out.println("UC3 Result: \"" + original + "\" is NOT a Palindrome");
        }
        // =======================================
    }
}