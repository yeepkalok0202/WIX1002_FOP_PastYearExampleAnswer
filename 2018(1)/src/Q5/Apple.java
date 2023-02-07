
package Q5;


public class Apple extends Fruit {
    private int quantity;
    
    public Apple(String name, String type, int quantity){
        super(name,type);
        this.quantity=quantity;
    }
    
    @Override
    public double totalPrice(){
        if(type.equalsIgnoreCase("green")){
            return 1.2*quantity;
        }
        else if(type.equalsIgnoreCase("red")){
            return 1.8*quantity;
        }
        else{
            return 0;
        }
    }
    
    public String toString(){
        return super.toString()+"- "+this.quantity+"= RM"+
                String.format("%.2f", totalPrice());
    }
}
