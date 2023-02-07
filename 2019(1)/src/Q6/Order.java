
package Q6;

public class Order {
    protected String name, ID;
    protected int quantity;
    protected double unitprice;
    
    public Order(){
        this.name=this.ID=null;
        this.quantity=0;
        this.unitprice=0;
    }
    
    public Order(String name,String ID,int quantity,double unitprice){
        this.name=name;
        this.ID=ID;
        this.quantity=quantity;
        this.unitprice=unitprice;
    }
    public String getName(){
        return this.name;
    }
    public String getID(){
        return this.ID;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getUnitprice(){
        return this.unitprice;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public void setID(String ID){
        this.ID=ID;
    } 
    public void setQuantity(int quantity){
        this.quantity=quantity;
    } 
    public void setUnitprice(double unitprice){
        this.unitprice=unitprice;
    }
    
    public double computeTotalPrice(){
        return this.quantity*this.unitprice;
    }
    
    @Override
    public String toString(){
        return "Customer Name : "+this.name+"\nCusotomer Id : "+this.ID+
                "\nQuantity ordered : "+this.quantity+"\nUnit price : "+String.format("%.1f",this.unitprice)+
                "\nTotal Price : "+String.format("%.1f",computeTotalPrice());
    }
}
