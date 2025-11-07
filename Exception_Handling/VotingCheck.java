// Importing Scanner class for user input
import java.util.*;

// Custom exception class to handle invalid age input
class InvalidAgeException extends Exception {
    // Constructor that accepts an error message
    public InvalidAgeException(String message) {
        super(message); // Calls parent Exception class constructor
    }
}

// Main class to check voting eligibility
public class VotingCheck {

    // Main method - program execution starts here
    public static void main(String[] args) throws InvalidAgeException {
        // Creating Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);

        // Taking age input from user
        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();

        // Checking if age is valid for voting
        if (userAge < 18) {
            // Throwing custom exception if user is under 18
            throw new InvalidAgeException("Age must be at least 18 to vote.");
        } else {
            // If valid, display eligibility message
            System.out.println("You are eligible to vote.");
        }

        // Closing Scanner to prevent resource leak
        sc.close();
    }
}
