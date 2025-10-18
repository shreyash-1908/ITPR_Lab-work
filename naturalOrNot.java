import java.util.*;
public class naturalOrNot {
    // check if a number is natural or not only usinig if -
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number > 0) {
             System.out.println(number + " is a natural number.");
        }
        else {
            System.out.println(number + " is not a natural number.");
     }
    }
}