
package Q5;

public class Q5 {
    public static void main(String[] args) {
        Apple aa=new Apple("Apple","Red",8);
        System.out.println(aa.toString());
        Apple bb=new Apple("Apple", "Green", 11);
        System.out.println(bb.toString());
        
        Watermelon cc=new Watermelon("Watermelon", "Local", 7.6);
        System.out.println(cc.toString());
        Watermelon dd=new Watermelon("Watermelon", "Imported", 4);
        System.out.println(dd.toString());
        
        System.out.println("The cheapest item is");
        
        if(aa.totalPrice()<bb.totalPrice()&& aa.totalPrice()<cc.totalPrice() && aa.totalPrice()<dd.totalPrice()){
            System.out.println(aa.toString());
        }
        else if(bb.totalPrice()<aa.totalPrice() && bb.totalPrice()<cc.totalPrice() && bb.totalPrice()<dd.totalPrice()){
            System.out.println(bb.toString());
        }
        else if(cc.totalPrice()<aa.totalPrice() && cc.totalPrice()<bb.totalPrice() && cc.totalPrice()<dd.totalPrice()){
            System.out.println(cc.toString());
        }
        else{
            System.out.println(dd.toString());
        }
    }
}
