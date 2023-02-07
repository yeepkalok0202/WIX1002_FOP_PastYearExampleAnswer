
package Q5;


public class Essay extends GradedActivity{
    private int grammar,spelling,length,content;
    
    public Essay(int grammar, int spelling,int length,int content){
        this.grammar=grammar;
        this.spelling=spelling;
        this.length=length;
        this.content=content;
 
    }
    
    public String toString(){
        String temp="";
        super.setScore(this.content+this.grammar+this.spelling+this.length);
        temp+="Essay score:"+"\nGrammar: "+this.grammar+
                "\nSpelling: "+this.spelling+"\nLength: "+this.length+
                "\nContent: "+this.content+"\n"+"\n"+super.toString();
        return temp;
    }
}
