
package Q5;


public class SpecialDelivery extends Delivery {
    protected boolean weekend,nighttime;
    
    public SpecialDelivery(String sender, String recipient, double weight,boolean weekend, boolean nighttime){
        super(sender, recipient, weight);
        this.weekend=weekend;
        this.nighttime=nighttime;
        
    }
    
    @Override
    public double totalCost(){
       if(weekend&&nighttime){
           return (super.totalCost()+50)*1.2;
       }
       else if(weekend){
           return super.totalCost()+50;
       }
       else if(nighttime){
           return super.totalCost()*1.2;
       }
       else{
           return super.totalCost();
       }  
    }
    
    
    public String toString(){
        String temp="From : "+this.sender+" To: "+this.recipient+
                    "\nWeight of Package : "+this.weight+" kg"+
                    "\nShipping Cost : RM"+ this.totalCost();
        if(weekend){
            temp+="\nWeekend Delivery";
        }
        if(nighttime){
            temp+="\nNight Time Delivery";
        }
        return temp;
    }
}
