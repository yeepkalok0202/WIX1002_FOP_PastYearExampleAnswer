
package Q5;

public class PartTimeStaff extends Staff{
    private int hours;
    
    public PartTimeStaff(String name, String IC, int hours){
        super(name,IC);
        this.hours=hours;
    }
    
    public double getSalary(int hours){
        return 40*hours;
    }
    
    public String toString(){
        System.out.print(super.toString());
        return "\nWorking Hours : "+this.hours+"\nSalary : RM"+String.format("%.0f",getSalary(this.hours))+"\n";
    }
}
