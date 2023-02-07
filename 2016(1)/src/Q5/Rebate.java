
package Q5;

public class Rebate extends CreditCard {
    protected static double finalreward;

    public Rebate(String cardholder,String cardnumber){
        super(cardholder, cardnumber, "Cash Rebate");
    }
    public void getReward(String shoppingtype,double spent){
        if(shoppingtype.equalsIgnoreCase("fuel")){
            finalreward+=spent*0.08;
            super.setTotalcashreward(finalreward);
        }
        else if(shoppingtype.equalsIgnoreCase("utility")){
            finalreward+=spent*0.05;
            super.setTotalcashreward(finalreward);
        }
        else if(shoppingtype.equalsIgnoreCase("grocery")){
            finalreward+=spent*0.02;
            super.setTotalcashreward(finalreward);
        }
        else if(shoppingtype.equalsIgnoreCase("other")){
            finalreward+=spent*0.002;
            super.setTotalcashreward(finalreward);
        }
    }
}
