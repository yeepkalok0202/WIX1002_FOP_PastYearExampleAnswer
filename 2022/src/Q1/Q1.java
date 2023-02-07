
package Q1;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Random xx=new Random();
        System.out.print("3 random price values :"+"\t");
        for(int i=0;i<3;i++){
            double price=xx.nextDouble(201)+100;
            System.out.printf("%.2f \t", price);
        }
        System.out.print("\n5 random even-numbered years : ");
        for(int i=0;i<5;i++){
            int year=xx.nextInt(41)+1990;
            if(year%2==0)
                System.out.print("\t"+year);
            else{
                i--;
            }
        }
        System.out.print("\nCar Plate Number : ");
        String plate="";
        for(int i=0;i<7;i++){
            int rand=xx.nextInt(10);
            char c='Z';
            
            if(i<5){
                plate+=rand;
            }
            else{
                plate+=((char)(c-xx.nextInt(26)));
            }
        }
        System.out.println(plate);
        System.out.print("Random Word : ");
        String random="";
        
        for(int i=0;i<8;i++){
            boolean status;
            char c='Z';
            if((xx.nextInt(2)+1)%2==0){
                status=true;
            }
            else
                status=false;
            if(status==true){
                random+=((char)(c-xx.nextInt(26)));
            }
            else{
                random+=((char)(Character.toLowerCase(c)-xx.nextInt(26)));
            }
        }
        System.out.println(random);
    }
}
