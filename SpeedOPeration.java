import java.util.*;

//WAP to calculate speed when distance and time are given
public class Speed {
    float speed, distance, time ;
    public void InputData(){
        Scanner sc = new scanner(System.in);
        System.out.println("Enter the distance covered :");
        distance = sc.nextFloat();
        System.out.println("Enter the time taken :");
        time = sc.nextFloat();

    }
    public void DisplayData(){
        System.out.println("from given covered distance and time taken, Speed :" + speed);

    }

    public void calculateSpeed(){
        speed = distance/time;

    }

}   
public class SpeedOperation{
    public static void main(String[] args) {
        Speed speed= new Speed;
        Speed.InputData();
        Speed.DisplayData();

    }
}

