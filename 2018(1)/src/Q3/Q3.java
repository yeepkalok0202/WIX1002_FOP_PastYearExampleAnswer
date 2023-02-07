
package Q3;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        while(true){
        Scanner xx=new Scanner(System.in);
        System.out.print("Enter font size: ");
        int size=xx.nextInt();
        System.out.print("Enter font type: ");
        char type=xx.next().charAt(0);
        System.out.print("Enter format [1- Vertical, 2- Horizontal]: ");
        int format=xx.nextInt();
        
        display(size,type,format);
        }
    }
    
    public static void display(int size,char type, int format){
        
        if(format==1){
            String temp=""+type+type, connect=""+type;
            for(int i=0;i<size;i++){
                temp+=type;
                connect+=" ";
            }
            connect+=type;
            int height=size*2+3;
            for(int i=0;i<height;i++){
                if(i==0||i==height-1||i==(height/2)){
                    System.out.println(temp);
                }
                else{
                    System.out.println(connect);
                }
            }
        }
        
        
        if(format==2){
            String temp="", connect="";
            for(int i=0;i<(size*2+3);i++){
                temp+=type;
                if(i==0||i==size*2+3-1||i==((3+2*size))/2){
                    connect+=type;
                }
                else{
                    connect+=" ";
                }
            }
         int height=2+size;
         for(int i=0;i<height;i++){
             if(i!=0&&i!=height-1){
                 System.out.println(connect);
             }
             else{
                 System.out.println(temp);
             }
         }

        }
        if(format!=1 && format!=2){
            System.out.println("Invalid format!");
        }
    }
}
