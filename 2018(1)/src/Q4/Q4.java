
package Q4;
import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        try{
            Scanner xx=new Scanner(new FileInputStream("C:\\Users\\XxOx\\Downloads\\2018(1)\\src\\Q4\\Q4.txt"));
            //count how many players
            int counter=0;
            while(xx.hasNextLine()){
                xx.nextLine();
                counter++;
            }
            //Declare array
            String[] name=new String[counter];
            double[][] mark=new double[counter][5];
            double[] difficulty=new double[counter];
            //arrange all attributes into arrays
            xx=new Scanner(new FileInputStream("C:\\Users\\XxOx\\Downloads\\2018(1)\\src\\Q4\\Q4.txt"));
            int count=0;
            while(xx.hasNextLine()){
                String[] temp=(xx.nextLine()).split(","); //Name 1 2 3 4 5 difficulty
                for(int i=0;i<temp.length;i++){
                    if(i==0){
                        name[count]=temp[i];   // name[0] --> name[1]
                    }
                    else if(i==temp.length-1){
                        difficulty[count]=Double.parseDouble(temp[i]);
                    }
                    else{
                        mark[count][i-1]=Double.parseDouble(temp[i]); //mark[0][0]; mark[0][1] mark[0][2].....mark[0][5]
                    }//count=0
                }
                count++; //count=1
            }
            xx.close();
            
            //sort the marks
            //sum up the marks and multiply to get final score;
            double lastscore[]=new double[counter];
            double total=0;
            for(int i=0;i<mark.length;i++){
                Arrays.sort(mark[i]); 
                for(int j=1;j<mark[i].length-1;j++){
                    total+=mark[i][j];
                }
                lastscore[i]=total*difficulty[i];
                total=0;
            }
            
        //Display the final score for each player and determine the winner
            double max=lastscore[0];
            int index=0;
            for(int i=0;i<lastscore.length;i++){
                System.out.println(name[i]+"  score  "+lastscore[i]);
                if(lastscore[i]>max){
                    max=lastscore[i];
                    index=i;
                }
            }
            System.out.println(name[index]+" is the winner ");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }
}
