
package Q2;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        System.out.println("Enter N: ");
        int dimension=xx.nextInt();
        int[][] matrix1=new int[dimension][dimension];
        int[][] matrix2=new int[dimension][dimension];
        
        generateMatrix(matrix1);
        generateMatrix(matrix2);
        System.out.println("Matrix A: ");
        display(matrix1);
        System.out.println("Matrix B: ");
        display(matrix2);
        System.out.println("Matrix A+B : ");
        display(addMatrix(matrix1, matrix2));
        System.out.println("Matrix AxB : ");
        display(multiplyMatrix(matrix1, matrix2));
    }
    
    public static void generateMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                Random yy=new Random();
                matrix[i][j]=yy.nextInt(10);       
            }
        }
    }
    
    public static void display(int [][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.printf("%6s",matrix[i][j]);       
            }
        System.out.println();
        }
    }
    
    public static int [][] addMatrix(int[][] matrix,int [][] matrixx){
        int[][] result=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                result[i][j]=matrix[i][j]+matrixx[i][j];
            }
        }
        return result;
    }
    
    public static int[][] multiplyMatrix(int[][] matrix,int [][] matrixx){
        int[][] result=new int[matrix.length][matrixx[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                result[i][j]=0;
                for(int k=0;k<matrix.length;k++){
                    result[i][j]+=matrix[i][k]*matrixx[k][j];
                }
                
            }
        }
        return result;
    }
}
