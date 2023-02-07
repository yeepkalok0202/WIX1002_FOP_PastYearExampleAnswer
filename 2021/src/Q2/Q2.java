
package Q2;

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args)throws Exception {
        while(true){
        System.out.print("Enter 3 numbers [1-9] : ");
        Scanner xx=new Scanner(System.in);
        int a=xx.nextInt();
        int b=xx.nextInt();
        int c=xx.nextInt();
        final int answer=18;
        if((a<0 || a>9)||(b<0 || b>9)||(c<0 || c>9)){
            System.out.println("Invalid input, please enter number in range of [1-9]");
        }
        else{ 
        double[] input={a,b,c};
        char[] symbol={'+','-','*','/'};
        double gg1=0;
        for(int i=0;i<symbol.length;i++){ 
            for(int j=0;j<symbol.length;j++){
                double g=calc(symbol[i], input[0], input[1]);
                double h=calc(symbol[j],g,input[2]);
                double m=calc(symbol[j], input[1], input[2]);
                double n=calc(symbol[i],input[0],m);
                if(h==answer){
                    if((i==0 &&j==0)||(i==0&&j==1) || (i==2 && j==2)|| (i==2 && j==3)){
                        System.out.printf(" %.0f %1s %.0f  %1s %.0f = 18\n",input[0],symbol[i],input[1],symbol[j],input[2]);
                        gg1=-1;
                        continue;
                    }
                    else if((i>=2 && j>=2)){
                        System.out.printf(" %.0f %1s %.0f  %1s %.0f = 18\n",input[0],symbol[i],input[1],symbol[j],input[2]);
                        gg1=-1;
                    }
                    else{
                        System.out.printf(" (%.0f %1s %.0f) %1s %.0f = 18\n",input[0],symbol[i],input[1],symbol[j],input[2]);
                        gg1=-1;
                    }   
                    
                }
                if(n==answer){
                    if((i<=1 &&j>=2)){
                        System.out.printf(" %.0f %1s  %.0f %1s %.0f  = 18 \n",input[0],symbol[i],input[1],symbol[j],input[2]);
                        gg1=-1;
                    }
                    else{
                        System.out.printf(" %.0f %1s  ( %.0f %1s %.0f )  = 18 \n",input[0],symbol[i],input[1],symbol[j],input[2]);
                        gg1=-1;
                    }   
                }  
        }
        }
        if(gg1!=-1){
            System.out.println("No solution");
        }
    }
    }
    }
    public static double calc(char a,double x, double y)throws Exception{
        double z=0;
        switch(a){
            case '+': z=x+y; break;
            case '-': z=x-y;break;
            case '*': z=x*y;break;
            case '/': z=x/y; break;
            default:break;
        }
        return z;
    }
}