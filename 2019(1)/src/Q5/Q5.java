
package Q5;
public class Q5 {
    public static void main(String[] args) {
        SpecialDelivery aa=new SpecialDelivery("Ali","Ahmad",4.4,false,false);
        System.out.println(aa.toString());
        System.out.println("");
        SpecialDelivery bb=new SpecialDelivery("Ah Chong","Fatimah",63.1,false,false);
        System.out.println(bb.toString());
        System.out.println("");
        SpecialDelivery cc=new SpecialDelivery("FSKTM, UM","FK, UM",32.5,true,false);
        System.out.println(cc.toString());
        System.out.println("");     
        SpecialDelivery dd=new SpecialDelivery("Ang","Liew",19,true,true);
        System.out.println(dd.toString());
        System.out.println("");
        double total=aa.totalCost()+bb.totalCost()+cc.totalCost()+dd.totalCost();
        System.out.println("The total shipping cost is RM "+total);
        
    }
}
