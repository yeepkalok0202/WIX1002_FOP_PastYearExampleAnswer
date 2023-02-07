/*Write a program that asks a user to enter the number of teams, their team names, 
and their scores based on the table below. Then, display the team names and their 
scores in descending order with the highest team score first.*/
package Q2;
import java.util.*;

public class Q2 {
    public static void main(String[] args){
        Scanner xx=new Scanner(System.in);
        System.out.print("Enter number of teams: ");
        int number=xx.nextInt();
        
        String[] team=new String[number];
        int[] score=new int[number];
        xx.nextLine();
        for(int i=1;i<=number;i++){
            System.out.print("Enter team "+i+" name: ");
            team[i-1]=xx.nextLine();
            System.out.println();
            System.out.print("Enter team "+i+" score: ");
            score[i-1]=xx.nextInt();
            System.out.println();
            xx.nextLine();

        }
        
        for(int i=0;i<team.length;i++){
            for(int j=0;j<team.length-1;j++){
                if(score[j]<score[j+1]){
                    int temp=score[j];
                    String temp2=team[j];
                    score[j]=score[j+1];
                    team[j]=team[j+1];
                    score[j+1]=temp;
                    team[j+1]=temp2;
                }
            }
        }
        
        System.out.println("List of team with the highest team score first");
        
        for(int i=0;i<team.length;i++){
            System.out.print(team[i]+" ("+score[i]+") | ");
        }
        
        
    }
}
