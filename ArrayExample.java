import java.util.*;     //importing scanner class for user input
public class ArrayExample {
    public static void main(String[] args) {
        int numbers[];    //declaring array//declaration of the array
        numbers = new int[10];   //allocating memory to array
        Scanner sc = new Scanner(System.in);   //creating scanner object for user input
        System.out.print("Enter 10 numbers:");   //prompting user to enter 10 integers
        for (int index = 0; index<numbers.length; index++){   //loop to read 10 integers from user
            numbers[index] = sc.nextInt();   //storing user input in array

        }

        System.out.println("----------------------");
        System.out.println("Numbers are : ");
        for(int index = 0; index<numbers.length; index++){   //loop to display the numbers stored in array
            System.out.print(numbers[index]+" , ");   //displaying each number
            

        }   

    }
}