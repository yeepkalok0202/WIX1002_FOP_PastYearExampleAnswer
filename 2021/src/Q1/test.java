
package Q1;


public class test {
    public static void main(String[] args) {
        
        int integer[]={190817};
        
        String last="Divisibility Rule (Formula 2)\n";
        int even=0,odd=0;
        for(int i=0;i<integer.length;i++){
            int temp=integer[i];
            int temp5=0;
            while(temp>100){
                int temp2=temp/10;
                int temp3=temp%10;
                int temp4=temp2-temp3;
                System.out.print(temp2+" - "+temp3+"*1 = "+temp4+" ,");
                temp2=temp4;
                temp=temp4;
                temp5=temp4;
            }
            System.out.println(temp5);
        }
    }
}
