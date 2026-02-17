git add .//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * Palindrome Checker App
 * Objective: Validate if a string is a palindrome under different conditions.
 */
public class PalindromeCheckerApp {

    // UC1: Application Entry & Welcome Message
    // Key Concept: Main Method - The starting point for the JVM
    public static void main(String[] args) {

        // --- UC1: Startup Display ---
        displayWelcomeMessage();

        // --- Future Use Cases: Logic & Flow Control ---
        runPalindromeLogic();

        System.out.println("\nExiting program. Goodbye!");
    }

    /**
     * Displays the application name and version as per UC1 requirements.
     * Key Concept: Console Output (System.out.println)
     */
    public static void displayWelcomeMessage() {
        String appName = "Palindrome Checker App";
        String version = "v1.0.0";

        System.out.println("******************************************");
        System.out.println(" " + appName);
        System.out.println(" Version: " + version);
        System.out.println("******************************************");
        System.out.println("Status: System Initialized...\n");
    }

    /**
     * Handles the application flow for checking palindromes.
     */
    public static void runPalindromeLogic() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: '" + input + "' IS a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        scanner.close();
    }

    /**
     * Core Logic: Validates if a string reads the same forward and backward.
     */
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for accurate validation
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

