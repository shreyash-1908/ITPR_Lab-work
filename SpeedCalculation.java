import java.util.Scanner;
class SpeedCalculator{
    float distance;
    int time;
    public SpeedCalculator(float distance , int time){
    this.distance = distance;
    this.time=time;
    }
    //finding speed 
    private void calculatespeed(){
        float speed= distance/time;
        System.out.println("Speed = " + speed + "m/sec");
    }
    //finding speed
    public void displayData(){
        System.out.println("----------------------------");
        System.out.println("distance :"+ distance);
        System.out.println("Time : " +time);
        calculatespeed();  

    }
}
    public class SpeedCalculation{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter distance :");
            float distance = sc.nextFloat();
            System.out.print("Enter time :");
            int time = sc.nextInt();
            sc.close(); //to avpid resource leakage
            
            SpeedCalculator speedcal = new SpeedCalculator(distance , time);
            speedcal.displayData();

        }
    }


