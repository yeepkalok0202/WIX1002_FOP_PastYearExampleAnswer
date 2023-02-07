
package Q1;

import java.io.*;
import java.util.*;

public abstract class Eleven {
    protected int [] integer;
    protected String filename;
    
    public Eleven(String filename){
        this.filename=filename;
        try{
            ObjectInputStream xx=new ObjectInputStream(new FileInputStream(filename));
            //count how many integers;
            int countint=0;
            try{
                while(true){
                    xx.readInt();
                    countint++;
                }
            }
            catch(Exception e){
            }
            //suck the integers into arrays
            this.integer=new int[countint];
            int i=0;
            xx=new ObjectInputStream(new FileInputStream(filename));
            try{
                while(true){
                    this.integer[i++]=xx.readInt();
                }
            }
            catch(Exception e){
            }
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public abstract String divide();
        
    
}
