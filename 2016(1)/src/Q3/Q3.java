
package Q3;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        System.out.print("Enter the number of random integer :  ");
        int n=xx.nextInt();
        int[] number=random(n);
        display(number);
        displaymax(number);
        reverseNum(number);
        approximation(number);
    }
    public static int[] random(int n){
        Random xx=new Random();
        int[] test=new int[n];
        for(int i=0;i<n;i++){
            test[i]=xx.nextInt(1001);
        }
        return test;
    }
    
    public static void display(int [] n){
        System.out.println("The random integer : "+Arrays.toString(n));
    }
    
    public static void displaymax(int[] n){
        int[] a=new int[n.length];
        System.arraycopy(n,0,a,0,n.length);
        Arrays.sort(a);
        System.out.println("Maximum Number : "+a[a.length-1]);
    }
    public static void reverseNum(int [] n){
        System.out.print("The random integer in reverse order : ");
        for(int i=0;i<n.length;i++){
            String temp=String.valueOf(n[i]);
            StringBuilder xx=new StringBuilder(temp);
            System.out.print(xx.reverse()+"  ");
        }
        System.out.println("");
    }
    
    public static void approximation(int [] n){
        System.out.print("The approximation of the integer to the nearest tenth : ");
        for(int i=0;i<n.length;i++){
            if(n[i]%10<=4){
                System.out.print((n[i]/10)*10+"  ");
            }
            else{
                System.out.print((n[i]/10+1)*10+"  ");
            }
        }
        System.out.println("");
    }
}
