
package Q5;
import java.util.Random;
public class Q5 {
    public static void main(String[] args) {
        final int dimension=3;
        int[][] tictaetoe=new int[dimension][dimension];
        
        for(int i=0;i<tictaetoe.length;i++){
            for(int j=0;j<tictaetoe[i].length;j++){
                Random xx=new Random();
                tictaetoe[i][j]=xx.nextInt(2);
                System.out.print(tictaetoe[i][j]);
            }
            System.out.println("");
        }
        checkrow(tictaetoe);
        checkcolumn(tictaetoe);
        checkdiagonal(tictaetoe);
    }
    
    public static void checkrow(int [][] a){
        for(int i=0;i<a.length;i++){
            int counter=0;
            int temp;
            for(int j=0;j<a[i].length-1;j++){
                if(a[i][j]==a[i][j+1]){
                    counter++;
                }
            }
            if(counter==2){
                temp=a[i][0];
                System.out.println("All "+temp+"s on row "+(i));
            }  
        }
    }
    public static void checkcolumn(int [][] a){
        for(int i=0;i<a.length;i++){
            int counter=0;
            int temp;
            for(int j=0;j<a[i].length-1;j++){
                if(a[j][i]==a[j+1][i]){
                    counter++;
                }
            }
            if(counter==2){
                temp=a[0][i];
                System.out.println("All "+temp+"s on column "+(i));
            }  
        }
    }
    public static void checkdiagonal(int [][] a){
        int counter=0,counter2=0;
        int temp,temp2;
        for(int i=0;i<a.length-1;i++){
            if(a[i][i]==a[i+1][i+1]){
                    counter++;
            }
        }
        if(counter==2){
            temp=a[0][0];
            System.out.println("All "+temp+"s on diagonal 1");
        }
        for(int i=0;i<a.length-1;i++){
            if(a[i][a.length-1-i]==a[i+1][a.length-1-i-1]){
                    counter2++;
            }
        }
        if(counter2==2){
            temp2=a[0][2];
            System.out.println("All "+temp2+"s on diagonal 2");
        }
    }
}
