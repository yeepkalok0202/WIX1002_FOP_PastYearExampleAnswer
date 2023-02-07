
package Q1;


public class DivideF2 extends Eleven{
    
    public DivideF2(String filename){
        super(filename);
        System.out.println("");
    }
    public String divide(){
        String last="Divisibility Rule (Formula 2)\n";
        for(int i=0;i<integer.length;i++){
            int temp=integer[i];
            last+=temp+", : ";
            int temp5=0;
            while(temp>100){
                int temp2=temp/10;
                int temp3=temp%10;
                int temp4=temp2-temp3;
                last+=(temp2+" - "+temp3+"*1 = "+temp4+"   ");
                temp2=temp4;
                temp=temp4;
                temp5=temp4;
            }        
            last+=", x ="+temp5;
            int result=temp5%11;
                if(result==0){
                    last+=("\n"+temp5+" modulus 11 is equal to 0, "+integer[i]+" is divisible by 11");
                }
                else{
                    last+=("\n"+temp5+" modulus 11 is not equal to 0, "+integer[i]+" is not divisible by 11");
                }
            last+="\n\n";

        }
    
    return last;
    }
}
