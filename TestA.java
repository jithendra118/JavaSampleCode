public class TestA implements TestB,TestC{

    private long amount=0;
    @Override
    public void amount() {
        int a = TestB.a;
        amount+=a+1;
        System.out.println(amount);
    }

    @Override
    public void amount1() {
        amount = amount+10;
        System.out.println(amount);
    }

    public static void main(String[] args) {
        TestA a = new TestA();
        a.amount();
        a.amount1();
    }
}
