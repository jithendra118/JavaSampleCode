import java.util.*;

public class HashMapGeneric<T,T1>/*<T extends Object,T1 extends Object>*/ extends HashMap<T,T1> /*implements Map<T,T1>*/ {

    public static void main(String[] args) {
        HashMapGeneric map = new HashMapGeneric();
        map.put("test",new Integer(10));
        map.put(1,new Long(10));
        map.put(2,10);
        map.put('c',"jithu");

        Iterator it = map.keySet().iterator();
        Collection c =map.values();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
