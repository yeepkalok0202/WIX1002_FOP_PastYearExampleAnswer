
package Q5;

import java.util.Scanner;
public class A5 {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        System.out.print("Enter values for a,b and c: ");
        int a=xx.nextInt();
        int b=xx.nextInt();
        int c=xx.nextInt();
        QuadraticEquation aa=new QuadraticEquation(a,b,c);
        System.out.printf("The equation is "+String.format("%.0f",aa.getA())+"x(^2) +("+String.format("%.0f", aa.getB())+")x + ("+String.format("%.0f",aa.getC() )+")");
        System.out.println("");
        System.out.println("Discriminat: "+String.format("%.0f",aa.Discriminant() ));
        if(aa.Discriminant()<0){
            System.out.println("The equation has no roots");
        }
        else if(aa.Discriminant()==0){
            System.out.println("Same roots :"+String.format("%.0f", aa.calcRoot1()));
        }
        else{
            System.out.println("The roots : "+String.format("%.0f", aa.calcRoot1())+" and "+String.format("%.0f", aa.calcRoot2()));
        }
    }
}
