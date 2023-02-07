
package Q3;
import java.util.*;
import java.io.*;

public class Q3 {
    public static void main(String[] args) {  
            try{
            Scanner xx=new Scanner(new FileInputStream("C:\\Users\\XxOx\\Downloads\\2020\\src\\Q3\\raw.txt"));   
            String[] temp=(xx.nextLine()).split(" ");
            //convert to int
            int[] temp2=new int[temp.length];
            for(int i=0;i<temp.length;i++){
                temp2[i]=Integer.parseInt(temp[i]);
            }
            //sort the Array
            Arrays.sort(temp2);
            
            //count frequency of element in arrays
            int[] marker=new int[temp2.length];
                for(int i=0;i<temp2.length;i++){
                    int counter=1;
                    for(int j=i+1;j<temp2.length;j++){
                        if(temp2[j]==temp2[i]){
                            counter++;
                            marker[j]=-1; //visited index
                        }
                    }
                    if(marker[i]!=-1){
                        marker[i]+=counter;
                    }
                }
                
            //display
                System.out.println("Frequency Distribution Table ");
                for(int i=0;i<temp2.length;i++){
                    if(marker[i]!=-1){
                        System.out.println(temp2[i]+" : "+marker[i]);
                    }
                }
            //Display mode (get index)
                int max=-999;
                int i;
                for(i=0;i<marker.length;i++){
                    if(marker[i]>max){
                        max=i;
                    }
                }
                System.out.println("The mode of the dataset is : "+temp2[max]);
            }
                   
            catch(Exception e){
                    System.out.println(e.getMessage());
            }
            
        
        
    }
}
