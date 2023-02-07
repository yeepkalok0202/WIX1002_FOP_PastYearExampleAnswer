
package Q5;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks) :");
        int grammar=xx.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks) :");
        int spelling=xx.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks) :");
        int length=xx.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks) :");
        int content=xx.nextInt();

        Essay aa=new Essay(grammar, spelling, length, content);
        System.out.println(aa.toString());

    }
}
