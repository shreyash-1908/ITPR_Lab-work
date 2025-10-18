import java.util.*;
public class SubjectPercentage {
    //Calculate the percentage of marks obtained in 5 subjects 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        int subject1 = sc.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int subject2 = sc.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int subject3 = sc.nextInt();
        System.out.print("Enter marks for subject 4: ");
        int subject4 = sc.nextInt();
        System.out.print("Enter marks for subject 5: ");
        int subject5 = sc.nextInt();

        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (totalMarks / 500) * 100;
        
        System.out.printf("Total Marks: %d\n", totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        
        if (percentage >= 75) {
            System.out.println("Grade: A+");
        } else if (percentage >= 65) {
            System.out.println("Grade: A");
        } else if (percentage >= 55) {
            System.out.println("Grade: B");
        } else if (percentage >= 45) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}