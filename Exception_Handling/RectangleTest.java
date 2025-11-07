// Importing Scanner class for user input
import java.util.*;

// Custom exception class to handle invalid rectangle dimensions
class InvalidDimensionException extends Exception {
    // Constructor that accepts an error message
    public InvalidDimensionException(String message) {
        super(message); // Call the constructor of the Exception class
    }
}

// Main class to test rectangle area and perimeter
public class RectangleTest {

    // Main method - program execution starts here
    public static void main(String[] args) throws InvalidDimensionException {
        // Creating Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);

        // Taking length input from user
        System.out.print("Enter the length of rectangle: ");
        double rectLength = sc.nextDouble();

        // Taking width input from user
        System.out.print("Enter the width of rectangle: ");
        double rectWidth = sc.nextDouble();

        // Checking if entered dimensions are valid (positive values)
        if (rectLength <= 0 || rectWidth <= 0) {
            // Throwing custom exception when dimensions are invalid
            throw new InvalidDimensionException("Length and width must be positive numbers.");
        }

        // Calculating area of rectangle
        double rectangleArea = rectLength * rectWidth;
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Calculating perimeter of rectangle
        double rectanglePerimeter = 2 * (rectLength + rectWidth);
        System.out.println("Perimeter of Rectangle: " + rectanglePerimeter);

        // Closing the scanner to prevent memory leak
        sc.close();
    }
}
