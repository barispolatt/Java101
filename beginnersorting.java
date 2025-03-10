import java.util.Scanner;

public class beginnersorting {
public static void main(String[] args) {
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    a = sc.nextInt();
    System.out.println("Enter the second number");
    b = sc.nextInt();
    System.out.println("Enter the third number");
    c = sc.nextInt();

    if (a>b && a>c){
        if (b>c){
            System.out.println("From big to small: " + a + " > " + b + " > " + c);
        }
        else{
            System.out.println("From big to small: " + a + " > " + c + " > " + b);
        }
    }
    else if (b>a && b>c){
        if(a>c){
            System.out.println("From big to small: " + b + " > " + a + " > " + c);
            }
            else{
                System.out.println("From big to small: " + b + " > " + c + " > " + a);
            }
    }
    else if (c>a && c>b){
        if(a>b){
            System.out.println("From big to small: " + c + " > " + a + " > " + b);
        }
        else{
            System.out.println("From big to small: " + c + " > " + b + " > " + a);
        }
    }
}
}
