import java.util.Scanner;

public class SumOfNaturalNumbers {

    /**
     * This method calculates the sum of the first n natural numbers.
     * @param n The number of terms.
     * @return The sum of the first n natural numbers.
     */
    public static int calculateSum(int n) {
        // Check for non-positive input
        if (n <= 0) {
            return 0;
        }
        // Use the formula n*(n+1)/2 for an efficient calculation
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer (n):");
        int number = scanner.nextInt();

        // Call the method to calculate the sum
        int sum = calculateSum(number);

        // Print the result
        System.out.println("The sum of the first " + number + " natural numbers is: " + sum);

        scanner.close(); // Close the scanner
    }
}