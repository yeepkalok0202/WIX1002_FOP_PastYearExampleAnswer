package Q1;

public class Q1 {
    public static void main(String[] args) {
        int[] num={66,15,20,27,74,33};
        int cnt=0;
        for(int k=0;k<num.length;k++){
            if(isEven(num[k])==true){
                cnt++;
            }
        }
        System.out.println("The number of even integers is "+cnt);
        System.out.println("The bigges integer is "+findMax(num));
    }
    
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else
            return false;
    }
    
    public static int findMax(int [] a){
        int max=a[0];
        for(int n=1;n<a.length-1;n++){
            if(a[n]>max){
                max=a[n];
            }
        }
        return max;
    }
}
