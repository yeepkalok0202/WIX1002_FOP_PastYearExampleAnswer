
package Q6;

public class FinancialRecord {
    private int id;
    private double balance,annualInterestRate;
    
    public FinancialRecord(){
        this.id=0;
        this.balance=this.annualInterestRate=0;
    }
    public FinancialRecord(int id,double balance){
        this.id=id;
        this.balance=balance;
    }
    public void setID(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setAIR(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    public int getID(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getAIR(){
        return this.annualInterestRate;
    }
    public double getMonthlyInterestRate(){
        return getAIR()/12;
    }
    public void withdraw(double a){
        System.out.println("Previous balance : RM "+getBalance());
        this.balance-=a;
        System.out.println("Current balance after withdrawal of RM "+a+" is : RM "+ getBalance());
    }
    public void deposit(double a){
        System.out.println("Previous balance : RM "+getBalance());
        this.balance+=a;
        System.out.println("Current balance after deposit of RM "+a+" is : RM "+getBalance());
    }
    public String displayRecordInfo(){
        return "Financial record id is : "+getID()+"\nFinancial record balance is : RM "+
               getBalance()+"\nAnnual interest rate is: "+getAIR();
    }
}

