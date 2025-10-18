import java.util.Scanner;
public class triangleOrNot {
    // check if three sides can form a triangle or not by its angles
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first angle: ");
        float angle1 = sc.nextFloat();
        System.out.print("Enter second angle: ");
        float angle2 = sc.nextFloat();
        System.out.print("Enter third angle: ");
        float angle3 = sc.nextFloat();

        if (angle1>0 && angle2>0 && angle3>0 && angle1 + angle2 + angle3 == 180) {
            System.out.println("The angles can form a triangle.");
        }
        else {
            System.out.println("The angles cannot form a triangle.");
        }
    }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter first side: ");
    //     int side1 = sc.nextInt();
    //     System.out.print("Enter first side: ");
    //     int side2 = sc.nextInt();
    //     System.out.print("Enter first side: ");
    //     int side3 = sc.nextInt();
    //     if ( side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2 ) {
    //         System.out.println("The sides can form a triangle.");
    //     }
    //     else {
    //         System.out.println("The sides cannot form a triangle.");
    //     }
    // }
   
}