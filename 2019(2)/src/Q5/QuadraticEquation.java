
package Q5;
import java.util.*;
public class QuadraticEquation {
    protected double a,b,c;
    
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
        
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    
    public double Discriminant(){
        return Math.pow(this.b, 2)-4*this.a*this.c;
    }
    public double calcRoot1(){
        if(Discriminant()<0){
            return 0;
        }
        else{
            return(-this.b+Math.sqrt(this.b*this.b-4*this.a*this.c))/(2*this.a);
        }
    }
    public double calcRoot2(){
        if(Discriminant()<0){
            return 0;
        }
        else{
            return(-this.b-Math.sqrt(this.b*this.b-4*this.a*this.c))/(2*this.a);
        }
    }
}
