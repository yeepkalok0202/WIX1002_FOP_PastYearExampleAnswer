
package Q5;
public class Cloud {
    protected String cloudpackage;
    protected double totalcost;
    
    public Cloud(String cloudpackage){
        this.cloudpackage=cloudpackage;
    }
    public double getTotalcost(){
        return totalcost;
    }
    
    @Override
    public String toString(){
        return "Cloud Package : "+cloudpackage+
                " Total Cost= "+getTotalcost();
    }
}
