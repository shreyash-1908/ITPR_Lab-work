import java.util.Scanner;
public class SumOf2Number {
   // sum of two number using method with return type
    public static int sum(int a, int b) {
      return a + b;
   }
    public static void main(String[] args) {
        //cretaing a scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();    //input of first number
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();        //input of seconf number

        int result = sum(num1, num2);       // it will return the sum by calling the function "sum"

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        
    }
}