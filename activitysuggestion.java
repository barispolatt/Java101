import java.util.Scanner;
public class activitysuggestion {
    public static void main(String[] args) {
        int temperature;
        Scanner input = new Scanner(System.in);
        temperature = input.nextInt();
        if(temperature < 5){
            System.out.println("Ski or Snowboard");
        }
        else if(temperature > 5 && temperature < 15){
            System.out.println("Cinema");
        }
        else if(temperature > 15 && temperature < 25){
            System.out.println("Picnic");
        }
        else{
            System.out.println("Swimming");
        }

    }
}
