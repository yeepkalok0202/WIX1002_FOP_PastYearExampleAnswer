
package Q3;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int a=xx.nextInt();
        int test=(a*2-1)+6;
        for(int i=0;i<a;i++){
            System.out.printf("%"+(a-i)+"s", "");
            System.out.print((i+1)+"");
            int j=i;
            while(j>0){
                System.out.print(j+"");
                j--;
            }
            while(j!=i){
                System.out.print(j+2+"");
                j++;
            }
            System.out.println("");
        }
    }
   
}
