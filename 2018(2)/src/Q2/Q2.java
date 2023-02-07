
package Q2;

import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        System.out.print("Enter the number of bags sold : ");
        int num=xx.nextInt();
        System.out.print("Enter the weight per bag (kilogram) : ");
        double weight=xx.nextDouble();
        
        double price=num*weight*5.99*1.0725;
        System.out.println("");
        System.out.println("Price per kilogram :    $5.99");
        System.out.println("Sales tax :              7.25%");
        System.out.println("Total price after tax :   $"+String.format("%.2f", price));
    }
}
