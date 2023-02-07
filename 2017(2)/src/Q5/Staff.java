
package Q5;

public class Staff {
    private String name, IC;
    
    public Staff(String name,String IC){
        this.name=name;
        this.IC=IC;        
    }
    
    public String toString(){
        return "Name: "+this.name+"\nIC:"+this.IC;
    }       
}
