//WAP to calculate area and perimeter of circle
import java.util.*;
public class Circle {

    float radius;
    float area, perimeter;
    public void InputRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of cicrlce : ");
        radius = sc.nextFloat();
    }
        //method to display radius
    public void DisplayMeasurements(){
        System.out.println("radius of circle is : " + radius);

    }
        //method to calculate area
    public void calculateArea(){
        area = 3.14f * radius * radius;
        System.out.println("area of circle id :" + area );
       

    }
        //method to calculate perimeter
    public void calculatePerimeter(){       
        perimeter = (2 * 3.14f * radius);
        System.out.println("Perimeter of circle is : " + perimeter);


    }
    
}
public class CircleOperation{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.InputRadius();
        circle.DisplayMeasurements();
        circle.calculateArea();
        circle.calculatePerimeter();
    }
}
