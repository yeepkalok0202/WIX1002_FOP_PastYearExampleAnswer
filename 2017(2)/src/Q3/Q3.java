
package Q3;
/*Write a program that asks a user to enter an integer value, n. Based on this integer value, 
the program should generate a set of random values within the range of 0-10000. Store 
these values in an array. Then, create FOUR methods to perform the following actions.
 Display the set of integers in the array.
 Get the minimum number.
 Display the approximation of each integer value to the nearest hundred.
 Display each integer in the array in a reverse order.*/

import java.util.*;
public class Q3 {
    public static int number;
    public static int[] random;
        public static void main(String[] args){
            System.out.print("Enter the number of random integer: ");
            Scanner xx=new Scanner(System.in);
            number=xx.nextInt();
            xx.nextLine();
            random=new int[number];
        
            for(int i=0;i<random.length;i++){
                Random yy=new Random();
                random[i]=yy.nextInt(10001);
            }  
            //1
            display();
            //2
            System.out.println(minimum());
            //3
            approximation();
            //4
            reverse();
        }
        
        public static void display(){
            System.out.print("The random integer:  ");
            for(int i=0;i<number;i++){
                System.out.print(" "+random[i]+" ");
            }
            System.out.println();
        }
        
        public static int minimum(){
            System.out.print("Minimum Number : ");
            int randomv2[]=new int[random.length];
            System.arraycopy(random,0,randomv2,0,random.length);
            Arrays.sort(randomv2);
            return randomv2[0];
            
        }
        
        
        public static void approximation(){
            int randomv3[]=new int[random.length];
            System.arraycopy(random,0,randomv3,0,random.length);
            
            System.out.print("The approximation of the integer to the nearest hundred :  ");
            for(int i=0;i<number;i++){
                String temp=String.valueOf(random[i]);
                if(Integer.parseInt(temp.substring(temp.length()-2))>=50){
                    randomv3[i]=(randomv3[i]+100)-Integer.parseInt(temp.substring(temp.length()-2));
                    System.out.print(" "+randomv3[i]+" ");
                }
                else{
                    randomv3[i]=randomv3[i]-Integer.parseInt(temp.substring(temp.length()-2));
                    System.out.print(" "+randomv3[i]+" ");
                }         
            }
            System.out.println();
        }
        
        
        public static void reverse(){
            System.out.print("The random integer in reverse order : ");
            for(int i=0;i<random.length;i++){
                StringBuilder aa=new StringBuilder(Integer.toString(random[i]));
                System.out.print(" "+aa.reverse()+" ");
            }
        }
        
}
