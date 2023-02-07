
package Q5;

public class CloudPackage extends Cloud{
    protected int core,memory;
    protected double priceperhour;
    
    public CloudPackage(String cloudpackage,int core,int memory,double priceperhour){
        super(cloudpackage);
        this.core=core;
        this.memory=memory;
        this.priceperhour=priceperhour;  
    }
    
    public boolean check(Job a){
        return (this.memory>=a.getMemory());
    }
    
    public double totalCost(Job a){
        super.totalcost=((a.getTasknum()*(1)/this.core)*this.priceperhour);
        return super.totalcost;
    }
}
