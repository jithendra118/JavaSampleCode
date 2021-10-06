public class B extends A{
    // @Override is not possible with different data types primitive and wrapper class.used in child and parent
    public String doSomething(Integer i){
        System.out.println("Integer");
        return "Integer";
    }

   /* @Override
    public String doSomething(int i){
        System.out.println("int in child class");
        return "int in child class";
    }*/

    public String doSomething(Float i){
        System.out.println("Float");
        return "Integer";
    }

//Important
/*if same methods with argument data type is different like primitive and wrapper class but priority will
give to primitive first. ******/

    public static void main(String[] args) {
        A a = new B();
        //a.doSomething(10); // this method is available in sub class it will call that method else call parent method.
        B b = new B();
        b.doSomething(20);
        b.doSomething(new Integer(20)); // for calling wrapper class directly with same method Integer as argument
        b.doSomething(20.0f);
    }
}
