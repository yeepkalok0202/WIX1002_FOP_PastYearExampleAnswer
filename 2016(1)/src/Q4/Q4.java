
package Q4;
import java.util.*;
import java.io.*;
public class Q4 {
    public static void main(String[] args) {
        try{
            Scanner xx=new Scanner(new FileInputStream("C:\\Users\\XxOx\\Downloads\\2016(1)\\src\\Q4\\Q4.txt"));
            while(xx.hasNextLine()){
                String temp=xx.nextLine();
                if(char8(temp)==true && uppp(temp)==true && low(temp)==true && digit(temp)==true && nonan(temp)==true ){
                    System.out.println("Strong password");
                }
                else{
                    System.out.println("Not a strong password");
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static boolean char8(String n){
        if(n.length()<8){
            return false;
        }
        else{
            return true;
        }
    }
    
   public static boolean uppp(String n){
        int count=0;
        for(int i=0;i<26;i++){
            for(int j=0;j<n.length();j++){
                if(n.charAt(j)==((char)('A'+i))){
                    count++;
                }
            }
        }
        if(count==0){
            return false;
        }
        else{
            return true;
        }
    } 
    public static boolean low(String n){
        int count=0;
        for(int i=0;i<26;i++){
            for(int j=0;j<n.length();j++){
                if(n.charAt(j)==((char)('a'+i))){
                    count++;
                }
            }
        }
        if(count==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean digit(String n){
        int count=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<n.length();j++){
                if(n.charAt(j)==(Character.forDigit(i, 10))){
                    count++;
                }
            }
        }
        if(count==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean nonan(String n){
        int count=0;
            for(int j=0;j<n.length();j++){
                String temp=""+n.charAt(j);
                if(uppp(temp)==false && low(temp)==false && digit(temp)==false){
                    count++;
                }
            }
        if(count==0){
            return false;
        }
        else{
            return true;
        }
    }
    
}
