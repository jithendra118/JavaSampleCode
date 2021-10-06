import java.util.ArrayList;
import java.util.List;

public class A {
  /*  public A doSomething(){
        return new A();
    }*/

    public String doSomething(int i){
        System.out.println("int in super class");
        List<? extends Object> list = new ArrayList<Integer>();
        //list.add(Integer.valueOf(10));
        return "int in super class";
    }

    public String doDisplay(String s){
        return "";
    }

}
