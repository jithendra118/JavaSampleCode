import java.io.IOException;

public class ExceptionClass {

    public void m1() throws IOException{ //compile time or //checked exceptions
         //throw new IOException();
    }
    public void m2() throws ArithmeticException, IOException {
       /* try{
            int i=1/0;
        }catch (ArithmeticException e){
            throw new ArithmeticException("Arithmetic message");// rethrow
        }*/
            int i=10;
            if(i<10){
                throw new IOException();
            }else{
                //asdfasdlkfdsl+dfdf;
            }
    }

}

class SubExceptionClass extends ExceptionClass{
   public  void m1()throws IOException {
        System.out.println("test temp");
       // super.m1(); // it will give error beacuse checked exception not handled here when we call that method in super class
    }
    public void m2(){
        //super.m2();
    }
  /*  public  void m1() throws IOException{
        System.out.println("test temp");
        super.m1(); // no error here u are defining IO exception same as parent class.
    }*/

    public static void main(String[] args) {
        ExceptionClass sub = new SubExceptionClass();
       // sub.m1();
        try {
            sub.m1();
        }catch (IOException e){

        }
        finally {
            // this block will excute
        }
        // this way we can handle Exception Propagation for CHeck exception
    }
}
