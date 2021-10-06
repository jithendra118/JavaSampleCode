import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number");
        int a= sc.nextInt();
        System.out.print("Enter second number");
        int b= sc.nextInt();
        System.out.println(unLoadArms(a,b));
    }

    private static String unLoadArms(int a, int b) {
        if(a!=0 && b!=0 && a<=5000 && b<=5000){
            int aramA = a;
            int aramB = b/2;
            if(aramA==aramB){
                return "Yes";
            }else{
                return "No";
            }


        }
        return "";
    }

}
