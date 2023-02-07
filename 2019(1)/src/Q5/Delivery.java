
package Q5;


public class Delivery {
    protected String sender, recipient;
    protected double weight; //in kg
    
        public Delivery(String sender, String recipient,double weight){
            this.sender=sender;
            this.recipient=recipient;
            this.weight=weight;
        }
        
        public double totalCost(){
            if(this.weight<=5){
                return this.weight*2.8;
            }
            else if(this.weight>5 && this.weight <=20){
                return (5*2.8)+(this.weight-5)*5.2;
            }
            else if(this.weight>20 && this.weight <=50){
                return (5*2.8)+(15*5.2)+(this.weight-20)*7;
            }
            else{
                return (5*2.8)+(15*5.2)+(30*7)+(this.weight-50)*8.6;
            }
        }
        
    @Override
        public String toString(){
            return "From : "+this.sender+" To: "+this.recipient+
                    "\nWeight of Package : "+this.weight+" kg"+
                    "\nShipping Cost : RM"+ totalCost();
            
        }

}
