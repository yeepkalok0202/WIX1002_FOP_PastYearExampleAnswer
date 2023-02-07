
package Q1;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.print("Enter a number in pounds: ");
        Scanner xx=new Scanner(System.in);
        double a=xx.nextDouble();
        double b=a*0.454;
        System.out.println(a+" pounds is "+b+" kilograms");
    }
}
