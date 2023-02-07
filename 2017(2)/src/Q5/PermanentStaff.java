
package Q5;


public class PermanentStaff extends Staff{
    private String grade;
    private double salary;
    
    public PermanentStaff(String name,String IC,String grade){
        super(name,IC);
        this.grade=grade;
    }
    
    public double getSalary(String grade){
        if(grade.equalsIgnoreCase("EM01")){
            return 7000;
        }
        else if(grade.equalsIgnoreCase("EM02")){
            return 5000;
        }
        else if(grade.equalsIgnoreCase("EM03")){
            return 3000;
        }
        else if(grade.equalsIgnoreCase("EM04")){
            return 1000;
        } 
        else {
            return 0;
        }
    }
    
    @Override
    public String toString(){
        System.out.print(super.toString());
        return "\nGrade: "+this.grade+"\nSalary: RM"+String.format("%.0f",getSalary(this.grade))+"\n";
    }
}
