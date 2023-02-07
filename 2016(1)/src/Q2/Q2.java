
package Q2;
import java.util.Random;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
         String[] element={"","Paper","Scissor","Rock"};
         int playerscore=0,computerscore=0;
         while(playerscore<3 && computerscore<3){
                System.out.print("Enter 1.Paper 2.Scissor 3.Rock : ");
                int player=playerchoice();
                int computer=computerchoice();
                System.out.print("Player : "+element[player]);
                System.out.println("----- Computer :"+element[computer]);
                    if(player==1){
                        if(computer==2){
                            computerscore++;
                            System.out.println("Computer win "+computerscore+ " time(s)");
                        }
                        else if(computer==player){
                            System.out.println("It's a tie! Do it again");
                        }
                        else{
                            playerscore++;
                            System.out.println("Player wins "+playerscore+ " time(s)");                            
                        }
                    }
                    else if(player==2){
                        if(computer==1){
                            playerscore++;
                            System.out.println("Player wins "+playerscore+ " time(s)");                            
                        }
                        else if(computer==player){
                            System.out.println("It's a tie! Do it again");
                        }
                        else{
                            computerscore++;
                            System.out.println("Computer win "+computerscore+ " time(s)");
                        }
                    }
                    else if(player==3){
                        if(computer==1){
                            computerscore++;
                            System.out.println("Computer win "+computerscore+ "time(s)");                            
                        }
                        else if(computer==player){
                            System.out.println("It's a tie! Do it again");
                        }
                        else{
                            playerscore++;
                            System.out.println("Player wins "+playerscore+ "time(s)");                            
                        }
                    }
        }
         if(computerscore==3){
             System.out.println("Computer wins the game");
         }
         else{
             System.out.println("Player wins the game");
         }
    }
    
    public static int computerchoice(){
        Random xx=new Random();
        int computerchoose=xx.nextInt(3)+1;
        return computerchoose;
    }
    public static int playerchoice(){
        Scanner xx=new Scanner(System.in);  
        int playerchoose=xx.nextInt();
        while(playerchoose<1 || playerchoose>3){
            System.out.print("Enter in range 1-3 :<");
            playerchoose=xx.nextInt();
        }
        return playerchoose;    
    }
}
