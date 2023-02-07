
package Q5;


public class Point extends CreditCard{
    protected double finalpoint;
    protected static double finalreward2;

    public Point(String cardholder,String cardnumber){
        super(cardholder, cardnumber, "Point Reward");
    }
    
    public void getReward(String day,double spent){
        if(day.equalsIgnoreCase("friday")){
            finalpoint+=(Math.floor(spent))*2;
            finalreward2+=(finalpoint/100);
            super.setTotalcashreward(finalreward2);
            finalpoint=0;
        }
        else if(day.equalsIgnoreCase("saturday")){
            finalpoint+=(Math.floor(spent))*3;
            finalreward2+=(finalpoint/100);
            super.setTotalcashreward(finalreward2);
            finalpoint=0;
        }
        else if(day.equalsIgnoreCase("sunday")){
            finalpoint+=(Math.floor(spent))*4;
            finalreward2+=(finalpoint/100);
            super.setTotalcashreward(finalreward2);
            finalpoint=0;
        }
        else{
            finalpoint+=Math.floor(spent);
            finalreward2+=(finalpoint/100);
            super.setTotalcashreward(finalreward2);
            finalpoint=0;
        }
    }
    
    
}
