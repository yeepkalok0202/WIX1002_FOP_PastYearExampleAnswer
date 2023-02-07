
package Q6;

import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        System.out.print("Enter customer name : ");
        String name=xx.nextLine();
        System.out.print("Enter customer id   : ");
        String id=xx.nextLine();
        System.out.print("Enter quantity ordered : ");
        int quantity=xx.nextInt();
        System.out.print("Enter price per unit : ");
        double unitprice=xx.nextDouble();
        System.out.println("");
        
        Order aa=new Order(name,id,quantity,unitprice);
        System.out.println("Order record"); 
        System.out.println(aa.toString());
        System.out.println("");
        System.out.println("Shipped");
        System.out.println("Order record"); 
        ShippedOrder bb=new ShippedOrder("joe","123",10,5);
        System.out.println(bb.toString());
        
    
       
    }
        
}
