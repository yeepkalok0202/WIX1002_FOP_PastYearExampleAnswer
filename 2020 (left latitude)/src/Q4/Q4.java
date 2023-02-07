
package Q4;

import java.io.*;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        int counter=0,Scounter=0;
        System.out.println("Reading from log file. . .");
        System.out.println("*********************************************************");
        System.out.println("Records read from log file \n");
        try{
            Scanner xx=new Scanner(new FileInputStream("sampleLog"));
            while(xx.hasNextLine()){
                String temp=xx.nextLine();
                counter++;
                if(temp.substring(20,21).contains("S")){
                    Scounter++;
                }
            }
            xx=new Scanner(new FileInputStream("C:\\Users\\XxOx\\Downloads\\2020\\src\\Q4\\sampleLog"));        
            String[] submituser=new String[Scounter]; //wow
            String[][] all=new String[counter][22];             // this is the fucing shit that contains all thanks
            int counter2=0;
            int Scounter2=0;
            while(xx.hasNextLine()){
                String temp=xx.nextLine();
                String[] ok=temp.split(" ");
                System.out.println("Record "+(counter2+1)+" :");
                for(int i=0;i<ok.length;i++){
                    all[counter2][i]=ok[i];
                    System.out.println("    "+ok[i]); 
                }
                if(temp.substring(20,21).contains("S")){
                    submituser[Scounter2]=ok[1].substring(ok[1].indexOf("=")+1);
                    Scounter2++;
                }
                System.out.println("");
                counter2++;
            }
            System.out.println("total records read :"+counter2);
            System.out.println("\n********************************************************");
            System.out.println("Print user submission stat\n");
            xx.close();
            //find frequency of user
            //use marker array
            System.out.println("User             Jobs Submitted");
            System.out.println("----             --------------");
            int[] marker=new int[Scounter];
            for(int i=0;i<marker.length;i++){
                int countuser=1;
                for(int j=i+1;j<marker.length;j++){
                    if(submituser[j].equals(submituser[i])){
                        countuser++;
                        marker[j]=-1;//visited index
                    }
                }
                if(marker[i]!=-1){
                    System.out.printf("%-16s %-2s\n",submituser[i],countuser);
                }
            }
            System.out.println("\n*******************************************************");
            System.out.println("Print jobs status\n");
            System.out.println("Job ID      Submitted (queue)      Started (start time)     Exited (end time/ error)");
            System.out.println("-------     -----------------      --------------------     -------------------------");
            //Find all job id        
            String[] jobid=new String[all.length];   //array for job id
            for(int i=0;i<all.length;i++){
                String[] temp=all[i][1].split(";");
                String[] temp2=temp[temp.length-2].split("\\.");
                jobid[i]=temp2[0];
            }
            //find distinctive job id
            int[] marker2=new int[jobid.length];
            for(int i=0;i<jobid.length;i++){
                for(int j=i+1;j<jobid.length;j++){
                    if(jobid[j].equals(jobid[i]))
                        marker2[j]=-1;//visited index
                }
                if(marker2[i]!=-1){
                    System.out.printf("%-12s",jobid[i]);   //print jobid                  
                    int count=0; //count whether the exited exists;
                    for(int k=i;k<jobid.length;k++){
                        if(jobid[k].equals(jobid[i])){
                            if(all[k][1].contains("Q")){ // check for Q
                                System.out.printf("Y (%-3s) %15s",all[k][1].substring(all[k][1].indexOf("=")+1),"");
                                count++;
                            }
                            if(all[k][1].contains("S")){ //check for S
                                System.out.printf("Y (%-10s) %10s",all[k][8].substring(all[k][8].indexOf("=")+1),"");
                                count++;
                            }
                            
                            if(all[k][1].contains("E")){ //check for E
                                if(all[k][18].contains("used.cput=00:00:00")){ //not completed
                                    System.out.printf("Error :"+all[k][17]);
                                    count++;
                                }
                                else{ //completed
                                    System.out.printf(all[k][16].substring(all[k][16].indexOf("=")+1));
                                    count++;
                                }
                            } 
                        }
                    }
                    if(count!=3){ //if exited doesnt exist, then print null
                        System.out.print("null");
                    }
                    System.out.println("");
                }  
            }
            System.out.println("\n*******************************************************");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
