
package Q2;

import java.io.*;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        try {
            
            Scanner yy=new Scanner(new FileInputStream("C:\\Users\\XxOx\\Downloads\\2022\\src\\Q2\\diving.txt"));
            int temps=0,counter=0;
            while(yy.hasNextLine()){
                if(counter%5==0){
                    temps++;
                }
                counter++;
                yy.nextLine();
            }
            yy.close();
            Scanner xx=new Scanner(new FileInputStream("C:\\Users\\XxOx\\Downloads\\2022\\src\\Q2\\diving.txt"));
            int realcount=0;
            Diving[] count=new Diving[temps];
            while(xx.hasNextLine()){
                Diving aa=new Diving();
                String name=xx.nextLine();
                String country=xx.nextLine();
                double rating[]=new double[3];
                double[][] scores=new double[3][7];
                for(int i=0;i<3;i++){
                    String wow=xx.nextLine();
                    String[] temp=wow.split(" ");
                    for(int j=0;j<8;j++){
                        if(j==7){
                            rating[i]=Double.parseDouble(temp[j]);
                        }
                        else{
                            scores[i][j]=Double.parseDouble(temp[j]);
                        }
                    } 
                }
                count[realcount]=new Diving(name,country,scores,rating);
                System.out.println(count[realcount].toString());
                realcount++;
            }
            xx.close();
            System.out.println("");
            displayWinner(count);
            System.out.println("Gold : "+count[0].getName()+" ("+count[0].getCountry()+" )");
            System.out.println("Silver : "+count[1].getName()+" ("+count[1].getCountry()+" )");
            System.out.println("Bronze : "+count[2].getName()+" ("+count[2].getCountry()+" )");
            System.out.println("");
            System.out.println("Total number of records : "+temps);
            
        } catch (Exception e) {
            System.out.println("Error : "+e.getMessage());
        }
        
        
    }
    public static void displayWinner(Diving[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j].finalScore()<a[j+1].finalScore()){
                    Diving temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        } 
    }
    
}
