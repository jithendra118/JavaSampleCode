public class Simple {
    private static String name;
    public static void ma(String a){
        name =a;
        System.out.println(name);
    }
    public static void meow(){
        System.out.println(name);
    }

}
class Value{

    public static void main(String[] args) {
        Simple.ma("jithu");
        Simple.meow();
    }
}

class Teck{
    public static void main(String[] args) {
        Simple.meow();
    }
}