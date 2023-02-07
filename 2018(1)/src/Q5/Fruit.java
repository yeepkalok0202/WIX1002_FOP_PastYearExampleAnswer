
package Q5;


public abstract class Fruit {
    protected String name,type;
    
    public Fruit(String name,String type){
        this.name=name;
        this.type=type;
    }
    public abstract double totalPrice();
    public String toString(){
        return this.type+" "+this.name+" ";
    }
        
    
}
