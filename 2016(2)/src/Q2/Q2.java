
package Q2;

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000: ");
        Scanner xx=new Scanner(System.in);
        int a=xx.nextInt();
        while(a<0 || a>1000){
            System.out.print("Enter valid range 0-1000 : ");
            a=xx.nextInt();
        }
        //add all digits
        int temp=0;
        while(a>0){
            temp+=(a%10);
            a/=10;
        }
        System.out.println("The sum of the digits is "+temp);
    }
}
