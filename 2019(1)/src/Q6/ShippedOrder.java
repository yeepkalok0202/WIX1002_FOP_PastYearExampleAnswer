
package Q6;


public class ShippedOrder extends Order{
    protected final int charge=4;
        
    public ShippedOrder(String name,String ID,int quantity,double unitprice){
        super(name, ID, quantity, unitprice);
    }
    
    @Override
    public double computeTotalPrice(){
        return super.computeTotalPrice()+this.charge;
    }
    
    public String toString(){
        return super.toString();
    }
}
