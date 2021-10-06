import java.util.Locale;

public class StringSub {
    public static void m1(){// static implementation
        System.out.println("test");
    }

    public static void main(String[] args) {
     String s= "java";
     String temp =s.substring(s.indexOf('a')+1);
        System.out.println(temp);
     s= s.concat("rocks");
     s = s.substring(4,8);
     s.toUpperCase();
     System.out.println(s);
        StringSub sub= new StringSub();
        sub.m1();
    }
}
