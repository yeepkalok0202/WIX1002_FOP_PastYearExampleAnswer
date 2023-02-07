
package Q5;


public class GradedActivity {
    private int score;
    private char grade;
    
    public GradedActivity(){
        this.score=0;
    }
    public void setScore(int score){
        this.score=score;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public char getGrade(){
        if(score<60){
            return 'F';
        }
        else if(score>=60 && score<70){
            return 'D';
        }
        else if(score>=70 && score<80){
            return 'C';
        }
        else if(score>=80 && score<90){
            return 'B';
        }
        else{
            return 'A';
        }
    }
    
    public String toString(){
        String temp="";
        temp+="Total score :"+this.score+"\nEssay grade:"+getGrade();
        return temp;
    }
}
