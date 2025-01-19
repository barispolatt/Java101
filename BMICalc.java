import java.util.Scanner;
public class BMICalc {
    public static void main(String[] args) {
        double h, w;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter height in meters: ");
        h = inp.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        w = inp.nextDouble();

        double bmi = w/(h * h);

        System.out.print("Calculated BMI : " +bmi);
    }
}
