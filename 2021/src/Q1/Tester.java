
package Q1;


public class Tester {
    public static void main(String[] args) {
        DivideF1 a=new DivideF1("C:\\Users\\XxOx\\Downloads\\2021\\src\\Q1\\data.dat");
        display(a);
        DivideF2 b=new DivideF2("C:\\Users\\XxOx\\Downloads\\2021\\src\\Q1\\data.dat");
        display(b);

    }
    public static void display(Eleven el){
        System.out.println(el.divide());
    }
}
