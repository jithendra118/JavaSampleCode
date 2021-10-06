public class FunctionalInterfaceClass implements  FunctionalInterfaceTopic,FunctionalInterfaceTopic2{

    public static void main(String[] args) {
        FunctionalInterfaceClass c = new FunctionalInterfaceClass();
        System.out.println(c.m1());
        c.m3();
        FunctionalInterfaceTopic2.m2();


    }

    @Override
    public int m1() {
        return 10;
    }

    @Override
    public void m3() {
        FunctionalInterfaceTopic.super.m3();
    }
}
