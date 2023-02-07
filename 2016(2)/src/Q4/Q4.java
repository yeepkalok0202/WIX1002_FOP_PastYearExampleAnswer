
package Q4;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        System.out.print("Enter the value of n for a regular polygon, n: ");
        int n=xx.nextInt();
        System.out.print("Enter the length of a particular side of the regular polygon (in meter), s: ");
        double s=xx.nextInt();
        System.out.println("The area is :"+String.format("%.2f", area(n, s))+" sqaured meters");
    }
    public static double area(int n,double s){
        double temp1=n*(Math.pow(s,2));
        double temp2=4*(Math.tan(Math.toRadians(180/n)));
        double area=temp1/temp2;
        return area;
    }
}
