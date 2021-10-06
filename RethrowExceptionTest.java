public class RethrowExceptionTest {
    public static void main(String[] args) {
        ViewA view=  new ViewA();
        try {
            view.method2();
        } catch (Exception e) {
            System.out.println("caught in main method");
        }

    }
}

class ViewA {
    public void method1() throws Exception{
        System.out.println("called method1 in view class");
        throw new Exception("Called exception method 1 in view class");
    }

    public  void method2() throws Exception {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("----"+e);
            throw e;
        }
    }
}
