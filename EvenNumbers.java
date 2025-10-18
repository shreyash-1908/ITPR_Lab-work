//Program to create an array of 20 numbers given by user and display even numbers among them
import java.util.Scanner; //importing Scanner class for user input
public class EvenNumbers {
    public static void main(String[] args) {
        int numbers[] = new int[20]; //declaring array of 20 numbers
        Scanner sc = new Scanner(System.in); //creating object of Scanner class

        //Input of elements into the array through keyboard
        System.out.println("Enter any 20 numbers : ");
        for(int index = 0; index < numbers.length; index++) {
            numbers[index] = sc.nextInt(); //reading user input and storing it in array
        }

        sc.close(); //closing scanner object to avoid resource leak

        //Displaying even numbers
        System.out.println("Even numbers are : ");
        for(int index = 0; index < numbers.length; index++) {
            if(numbers[index] % 2 == 0) {
                System.out.print(numbers[index] + " ");
            }
        }
    }
}
