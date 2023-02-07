
package Q5;

public class CreditCard {
    protected String cardholder,cardnumber,type;
    protected double totalcashreward;
    
    public CreditCard(String cardholder,String cardnumber,String type){
        this.cardholder=cardholder;
        this.cardnumber=cardnumber;
        this.type=type;
    }
    public void setTotalcashreward(double a){
        this.totalcashreward=a;
    }
    public double getTotalcashreward(){
        return this.totalcashreward;
    }
    
    public String toString(){
        return "Credit Card : "+this.cardholder+" ("+this.cardnumber+")"+
                "\nCard Type : "+this.type+" \nTotal Cash Reward : "+getTotalcashreward();
    }
    
}
