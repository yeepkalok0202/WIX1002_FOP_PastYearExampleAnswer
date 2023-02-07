
package Q1;


public class DivideF1 extends Eleven{
    
    public DivideF1(String filename){
        super(filename);
        
    }
    
    @Override
    public String divide(){
        String last="Divisibility Rule (Formula 1)\n";
        int even=0,odd=0;
        for(int i=0;i<integer.length;i++){
            last+=(integer[i]+" : |x| = ");
            int temp1=integer[i];
            int temp2=temp1;
            //find even der
            last+=("(");
            while(temp1>0){
                int temp3=temp1%10;
                last+=(temp3);
                even+=temp3;
                temp1/=100;
                if(temp1>0){
                    last+=(" + ");
                }
            }
            last+=(") - (");
            //find odd der
            while(temp2>10){
                int temp4=temp2/10%10;
                last+=(temp4);
                odd+=temp4;
                temp2/=100;
                if(temp2>10){
                    last+=(" + ");
                }
            }
            int result=Math.abs((even-odd));
            last+=(")  |  = "+ result);
                if(result%11==0){
                    last+=("\n"+result+" modulus 11 is equal to 0, "+integer[i]+" is divisible by 11");
                }
                else{
                    last+=("\n"+result+" modulus 11 is not equal to 0, "+integer[i]+" is not divisible by 11");
                }
            last+="\n\n";
            even=0;odd=0;
        }
        return last;
    }
}




