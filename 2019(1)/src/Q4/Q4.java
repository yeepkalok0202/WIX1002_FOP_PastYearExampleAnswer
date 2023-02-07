
package Q4;

import java.io.FileInputStream;
import java.util.*;
import jdk.jfr.Frequency;

public class Q4 {
    public static void main(String[] args) {
        try{
            Scanner xx=new Scanner(new FileInputStream("C:\\Users\\XxOx\\Downloads\\2019(1)\\src\\Q4\\myAmbition.txt"));
            int sentences=0,wordss=0;
            String[] words;
            int[] frequency=new int[26];

            System.out.println("The essay is : ");
            while(xx.hasNextLine()){
                String temp=xx.nextLine();                
                if(temp.contains(".")){
                    sentences++;
                }
                
                for(int i=0;i<temp.length();i++){
                    if(Character.toLowerCase(temp.charAt(i))-'a'>=0 && Character.toLowerCase(temp.charAt(i))-'a'<=25){
                        frequency[(Character.toLowerCase(temp.charAt(i))-'a')]++;
                    }
                }
                 
                 words=temp.split(" ");
                 for(int i=0;i<words.length;i++){
                     System.out.print(words[i]+" ");
                     if(!words[i].equalsIgnoreCase(""))
                        wordss++;
                     
                 }
                 System.out.println();   
            }
            System.out.println();
            System.out.println("Number of sentences : "+sentences);
            System.out.println("Number of words : "+wordss);
                for(int i=0;i<frequency.length;i++){
                    System.out.print((char)(i+'a')+" : "+frequency[i]+"  ");
                }
            
            xx.close();
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
