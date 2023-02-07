
package Q4;

public class Pizza {
    protected String size;
    protected int numOfCheeseTopping,numOfBeefTopping,numOfChickenTopping;
    
    public Pizza(){
        this.size=null;
        this.numOfBeefTopping=this.numOfCheeseTopping=this.numOfChickenTopping=0;
    }
    
    public Pizza(String size, int numOfCheeseTopping,int numOfBeefTopping,int numOfChickenTopping){
        this.size=size;
        this.numOfCheeseTopping=numOfCheeseTopping;
        this.numOfBeefTopping=numOfBeefTopping;
        this.numOfChickenTopping=numOfChickenTopping;
    }
    
    public String getSize(){
        return this.size;
    }
    public int getNumOfCheeseTopping(){
        return this.numOfCheeseTopping;
    }
    public int getNumOfBeefTopping(){
        return this.numOfBeefTopping;
    }
    public int getNumOfChickenTopping(){
        return this.numOfChickenTopping;
    }
    
    public void setSize(String size){
        this.size=size;
    }
    
    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping) {
        this.numOfBeefTopping = numOfBeefTopping;
    }

    public void setNumOfChickenTopping(int numOfChickenTopping) {
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public double computeCost(){
        int total=this.numOfBeefTopping+this.numOfCheeseTopping+this.numOfChickenTopping;
        if(this.size.equalsIgnoreCase("small")){
            return 10+total*2;
        }
        else if(this.size.equalsIgnoreCase("medium")){
            return 12+total*2;
        }
        else if(this.size.equalsIgnoreCase("large")){
            return 14+total*2;
        }
        else{
            return 0;
        }
    }
    
    public void display(){
        System.out.println("Pizza size: "+getSize());
        System.out.println("Quantity of Beef Topping: "+getNumOfBeefTopping());
        System.out.println("Quantity of Cheese Topping: "+getNumOfCheeseTopping());
        System.out.println("Quantity of Chicken Topping: "+getNumOfChickenTopping());
        System.out.println("Cost: $"+computeCost());
    }
    
}
