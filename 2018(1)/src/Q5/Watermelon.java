
package Q5;

public class Watermelon extends Fruit{
    protected double weight;
    
    public Watermelon(String name,String type, double weight){
        super(name, type);
        this.weight=weight;
    }
    
    @Override
    public double totalPrice(){
        if(type.equalsIgnoreCase("local")){
            if(weight<2){
                return this.weight*2.25;
            }
            else if(weight>=2 && weight<=5){
                return this.weight*1.95;
            }
            else{
                return this.weight*1.65;
            }
        }
        else if(type.equalsIgnoreCase("imported")){
            if(weight<2){
                return this.weight*3.75;
            }
            else if(weight>=2 && weight<=5){
                return this.weight*3.45;
            }
            else{
                return this.weight*3.15;
            }
        }
        else{
            System.out.println("Invalid type");
            return 0;
        }
    }
    
    public String toString(){
        return super.toString()+"- "+this.weight+
                "kg  = RM"+String.format("%.2f",totalPrice());
    }
}
