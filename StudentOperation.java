import java.util.*;
public class Student {
    //it must receive name, age, and standard, roll no. , from user and display them by class menthod
    String name;
    int age, standard, rollNo;
            //method to input student details
    void InputDetails() {
                //input details from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter standard: ");
        standard = sc.nextInt();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
    }
            //method to display student details
    void DisplayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Standard: " + standard);
        System.out.println("Roll Number: " + rollNo);
    }
        
    
}
public class StudentOperation {
    public static void main(String[] args) {
        Student student = new Student();
        student.InputDetails();
        student.DisplayDetails();
    }
}