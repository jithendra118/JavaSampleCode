public interface FunctionalInterfaceTopic {
    public int m1();
    public static void m2(){
        System.out.println("static in Interface");
    }
    default void m3(){
        System.out.println("default in Interface");
    }
}
