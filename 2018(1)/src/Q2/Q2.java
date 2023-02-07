
package Q2;

import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        System.out.print("Enter N number: ");
        int n=xx.nextInt();
        
        int a=0,aa=0,aaa=0;
        Random r=new Random();
        for(int i=0;i<n;i++){
            int random=r.nextInt(101)+50;
            if(random%10==0||random%10==1||random%10==2||random%10==3){
                aaa++;
            }
            else if(random%10==4||random%10==5||random%10==6){
                aa++;
            }
            else{
                a++;
            }
            System.out.print(random+" ");
        }
        System.out.println("\nGroup AAA: "+aaa);
        System.out.println("Group AA: "+aa);
        System.out.println("Group A: "+a);

    }
}
