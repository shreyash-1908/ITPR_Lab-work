import java.util.Scanner;

public class Factorial {

    /**
      This method calculates the factorial of a given number.
     */
    public static long findFactorial(int n) {
        // Factorial is not defined for negative numbers
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; // Return -1 to indicate an error
        }

        // Base case: The factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Use long to store the result to avoid overflow for larger numbers
        long factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial; // Return the calculated factorial
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a non-negative number to find its factorial:");
        int num = scanner.nextInt();

        // Call the method to find the factorial
        long result = findFactorial(num);
        
        // Print the result only if the input was valid
        if (result != -1) {
             System.out.println("The factorial of " + num + " is: " + result);
        }

        scanner.close(); // Close the scanner
    }
}