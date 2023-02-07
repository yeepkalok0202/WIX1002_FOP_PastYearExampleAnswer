package Q2;
import java.io.*;
import java.util.*;
public class count {
    static int temps=0,counter=0;
    public static void main(String[] args)throws Exception{
            
            Scanner yy=new Scanner(new FileInputStream("C:\\Users\\XxOx\\Downloads\\2022\\src\\Q2\\diving.txt"));
            int temps=0,counter=0;
            while(yy.hasNextLine()){
                if(counter%5==0){
                    temps++;
                }
                counter++;
            }
            yy.close();
            System.out.println(counter);
    }
}
