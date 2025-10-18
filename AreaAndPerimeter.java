//to calculate are and perimeter of rectangle using methods
import java.util.*;   
public class AreaAndPerimeter {
    // method to calculate area
    // l=length, b=breadth
    public void area(int l, int b) {
        System.out.println( " Area = " + l*b);


    }

    // method to calculate perimeter
    public void perimeter(int l, int b) {
        System.out.println(" Perimeter " + (2*(l+b)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input length and breadth
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        // calculate area and perimeter
        area(l, b);
        perimeter(l, b);

        // display results
        // System.out.println("Area of rectangle: " + area);
        // System.out.println("Perimeter of rectangle: " + perimeter);

    }
}