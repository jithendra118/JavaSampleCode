public interface FunctionalInterfaceTopic2 {
    public int m1();
    public static void m2(){
        System.out.println("static in Interface2");
    }
    default void m3(){
        System.out.println("default in Interface2");
    }

}
