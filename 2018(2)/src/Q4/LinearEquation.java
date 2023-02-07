
package Q4;


public class LinearEquation {
    private int a,b,c,d,e,f,x,y;
    
    public LinearEquation(int a,int b,int c,int d,int e,int f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    @Override
    public String toString(){
        String temp="";
        temp+=   this.a+"x + "+this.b+"y ="+this.e+"\n"+
                this.c+"x + "+this.d+"y ="+this.f;
        return temp;
    }
    
    public boolean isSolvable(){
        if((this.a*this.d)-(this.b*this.c)!=0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public double computeX(){
        this.x=((this.e*this.d)-(this.b*this.f))/((this.a*this.d)-(this.b*this.c));
        return x;
    }
    public double computeY(){
        this.y=((this.a*this.f)-(this.e*this.c))/((this.a*this.d)-(this.b*this.c));
        return y;
    }
    
}
