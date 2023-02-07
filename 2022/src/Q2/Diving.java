
package Q2;
import java.util.*;
public class Diving {
    protected String name,country;
    protected double[][] scores;
    protected double[] rating;
    
    public Diving(){
        this.name=this.country=null;
        this.scores=new double[3][7];
        this.rating=new double[3];
    }
    public Diving(String name, String country, double[][] scores,double[] rating){
        this.name=name;
        this.country=country;
        this.scores=scores;
        this.rating=rating;   
    }
    
    public String getName(){
        return this.name;
    }
    public String getCountry(){
        return this.country;
    }
    
    public double finalScore(){
        double remain=0,total=0;
        //sort the marks
        for(int i=0;i<this.scores.length;i++){
            Arrays.sort(this.scores[i]);
            for(int j=2;j<this.scores[i].length-2;j++){
                remain+=this.scores[i][j];
            }      
            total+=remain*this.rating[i];
            remain=0;
        }
        
        return total;
    }
    
    @Override
    public String toString(){
        String etc="";
        etc+="Diver : "+getName()+" ("+getCountry()+") ";
        for(int i=0;i<scores.length;i++){
            etc+="\nJudges Scores : "+Arrays.toString(scores[i]);
            etc+="\nDifficulty Rating : "+String.format("%.1f",rating[i]);
        }
        etc+="\nFinal Score : "+String.format("%.1f", finalScore());
        etc+="\n";
        return etc;
                
    }
}
