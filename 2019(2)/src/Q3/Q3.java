
package Q3;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        while(true){
            Random xx=new Random();
            Random yy=new Random();
            Scanner aa=new Scanner(System.in);
            int number1=xx.nextInt(10);
            int number2=yy.nextInt(10);
            
            System.out.print("What is "+number1+" + "+number2+" ? ");
            int a=aa.nextInt();
            if(a==(number1+number2)){
                System.out.println(number1+" + "+number2+" = "+a+" is true");
            }
            else{
                System.out.println(number1+" + "+number2+" = "+a+" is false");
            }
            
            System.out.println("Do you want to try another question (y/n) ? : ");
            char temp=aa.next().charAt(0);
            
            if(temp=='n'){
                System.out.println("Program ends");
                break;
            }
            
        }
    }
}
