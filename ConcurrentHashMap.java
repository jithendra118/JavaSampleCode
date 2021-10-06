import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentHashMap {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3,3);

       Iterator<Integer> it = map.keySet().iterator();// keys
        //map.values().iterator();
        while(it.hasNext()) { // size willnot change in hashmap it will work
            Integer key = it.next();
            System.out.println("Map Value:" + map.get(key));
            if (key.equals(2)) {
                map.put(1, 4); // work here
                //map.remove(1); // concurrent exception
                it.remove(); // it work because it is iterator remove
            }
        }



        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
            map.put(3,4); // update right it will not give concurrent exception
           // map.put(4,4); // new concurrent exception while adding new record.
        }
    }
}

