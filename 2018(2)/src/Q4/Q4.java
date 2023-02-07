
package Q4;

import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        System.out.print("Enter the values for a,b,c,d,e and f:");
        int a=xx.nextInt();
            int b=xx.nextInt();
                    int c=xx.nextInt();
                            int d=xx.nextInt();
                                    int e=xx.nextInt();
                                            int f=xx.nextInt();
        LinearEquation aa=new LinearEquation(a,b,c,d,e,f);
        System.out.println("\nThe equation :");
        System.out.println("\n"+aa.toString());
        
        if(aa.isSolvable()==false){
            System.out.println("the equation has no solution");
        }
        else{
            System.out.println("x="+aa.computeX()+";"+"y="+aa.computeY());
        }
    }
}
