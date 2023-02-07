
package Q6;


public class Q6 {
    public static void main(String[] args) {
        System.out.println("The information about financial record A is as follows : ");
        FinancialRecord aa=new FinancialRecord();
        aa.setAIR(7.77);
        aa.setBalance(10000);
        aa.setID(1234);
        System.out.println(aa.displayRecordInfo());
        
        System.out.println("\nThe information about financial record B is as follows : ");
        FinancialRecord bb=new FinancialRecord();
        bb.setAIR(8);
        bb.setBalance(20000);
        bb.setID(1001);
        System.out.println(bb.displayRecordInfo());
        System.out.println("The monthly interest rate is : "+bb.getMonthlyInterestRate());
        bb.deposit(1500);
        bb.withdraw(500);
    }
}
