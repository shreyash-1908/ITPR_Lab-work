import java.util.Scanner;
public class typeOfTriangle {
    // check the type of triangle by its angles
     public static void main(String[] args) { 
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first angle: ");
        float angle1 = sc.nextFloat();
        System.out.print("Enter second angle: ");
        float angle2 = sc.nextFloat();
        System.out.print("Enter third angle: ");
        float angle3 = sc.nextFloat();

        if (angle1>0 && angle2>0 && angle3>0 && angle1 + angle2 + angle3 == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("The triangle is a right triangle.");
            }
            else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                System.out.println("The triangle is an acute triangle.");
            }
            else {
                System.out.println("The triangle is an obtuse triangle.");
            }
        }
        else {
            System.out.println("The angles cannot form a triangle.");
        }
    }
    
}
