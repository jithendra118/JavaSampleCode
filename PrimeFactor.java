import java.util.*;
import java.lang.Math;

public class PrimeFactor {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter number");
        int a= sc.nextInt();
        double d1 =largestPrimeFactor(a) ;
        double d2 =Math.sqrt(a);
        if(d2<d1){
            System.out.println("Strange");
        }else{
            System.out.println("Not Strange");
        }
    }
    public static int largestPrimeFactor(int n) {
        if (n <= 1) {
            return 0;
        } else {
            int div = 2;
            while (div < n) {
                if (n % div != 0) {
                    div++;
                } else {
                    n = n / div;
                    div = 2;
                }
            }
            return n;
        }
    }
}

