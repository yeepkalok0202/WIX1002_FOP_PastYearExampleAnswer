
package Q3;

import java.io.*;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        
        
        try{
            Scanner xx=new Scanner(new FileInputStream("C:\\Users\\XxOx\\Downloads\\2018(2)\\src\\Q3\\student.txt"));
            int size=0;
            while(xx.hasNextLine()){
                xx.nextLine();
                size++;
            }
            xx=new Scanner(new FileInputStream("C:\\Users\\XxOx\\Downloads\\2018(2)\\src\\Q3\\student.txt"));
            int counter=0;
            String name[]=new String[size];
            double mark[]=new double[size];
            while(xx.hasNextLine()){
                String temp=xx.nextLine();
                String[] temp2= temp.split(",");
                name[counter]=temp2[0];
                mark[counter]=Double.parseDouble(temp2[1]);
                counter++;
            }
        xx.close();
        //bubble sort
        for(int i=0;i<name.length;i++){
            for(int j=0;j<name.length-1;j++){
                if(mark[j]<mark[j+1]){
                    String temp=name[j];
                    double temp2=mark[j];
                    name[j]=name[j+1];
                    mark[j]=mark[j+1];
                    name[j+1]=temp;
                    mark[j+1]=temp2;
                }
            }
        }
        //search for element -1
        int absent=0,index=-1;
        for(int i=mark.length-1;i>=0;i--){
            if(mark[i]==-1){
                absent++;
            }
            else{
                index=i;
                break;
            }
        }
            System.out.println("The student with the highest mark : "+name[0]+" "+String.format("%.0f", mark[0]));
            System.out.println("The student with the lowest mark :  "+name[index]+" "+String.format("%.0f", mark[index]));
            System.out.println("The number of students who were absent from the exam : "+ absent);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
       
    }
}
