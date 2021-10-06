public class RethrowException {

    public void m1() throws IndexOutOfBoundsException{
        throw new IndexOutOfBoundsException();
    }

    public static void main(String[] args) {
        RethrowException exce = new RethrowException();
        try
        {
            exce.m1();
        }catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException();
        }
    }

}
