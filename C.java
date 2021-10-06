public class C {
    protected void m1(){

    }
    public  void m2(){

    }
}


class D extends C{
    // give compile time error if we use private modifier of m1() from Super class C in D class.
    // we can't assign default values also.
  /*  private void m1(){
        // protected(super-class)- private/defaulte not allowed.
    }*/


   public void m1(){
    // we can use public here in subclass of m1 method but in super class method modifier is protected.
       // proteced(super-calss)- public (subClass) allowable working


  }

 /* protected void m2(){
        // public in super class - protected in subclass is not allowed compilation error.
  }
*/
/* sequence of AccessModifiersL:-*/
    //public- private- protected-(package-private).
}