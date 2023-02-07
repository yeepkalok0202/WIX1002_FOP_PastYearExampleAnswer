
package Q2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        System.out.print("Enter the number of bags sold : ");
        int bags=xx.nextInt();

        System.out.print("Enter the weight per bag (kilogram) : ");
        double kilo=xx.nextDouble();
        
        double totalP=kilo*bags*5.99;
        double totalPWT=totalP+totalP*0.0725;
        
        System.out.println("Price per kilogram:   $5.99");
        System.out.println("Sales tax         :    7.25%");
        System.out.printf("Total price       :     $"+String.format("%.2f", totalPWT)+"\n");
    }
}
