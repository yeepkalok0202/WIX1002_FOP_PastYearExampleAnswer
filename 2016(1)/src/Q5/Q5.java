
package Q5;


public class Q5 {
    public static void main(String[] args) {
        
        Rebate xx=new Rebate("John Lim","1111222233334444");
        Point yy=new Point("John Lim","5555666677778888");
        xx.getReward("Grocery", 124.8);
        xx.getReward("Other", 64.60);
        xx.getReward("Fuel", 95.4);
        xx.getReward("utility", 100);
        xx.getReward("Other", 220);
        System.out.println(xx.toString());
        yy.getReward("Saturday", 124.8);
        yy.getReward("Friday", 64.60);
        yy.getReward("Sunday", 95.4);
        yy.getReward("Friday", 100);
        yy.getReward("Tuesday", 220);
        System.out.println(yy.toString());
        
    }
    
    
}
