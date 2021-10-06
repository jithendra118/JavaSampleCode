import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class for count using one loop duplicate values in hashMap
 */
public class Contains {
    // repeated or duplicate count with one for loop
    public static void main(String[] args) {
        String s ="aabbccddfgaaccbbbcccfgh";
        int temp =0;
        int t1 = temp++;
        int t2 = ++temp;
        int t3=0;
        //  new HashMap created
        // single For loop with duplicate count 
        //System.out.println(t1+"---------"+t2);
        //System.out.println(t1+"---------"+t2);
        //System.out.println(t1+"---------"+t2);
        List<String> list = new ArrayList<>();
        System.out.println(list.get(0));

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c= s.charAt(i);
            if(map.containsKey(c)){
                int cnt = map.get(c);
                map.put(c,++cnt);
            }else{
                map.put(c,1);
            }
        }
        map.forEach((k,v)->System.out.println(k+"---"+v));
        //s.chars().distinct().count();
        String[] art = {"Jimmy","tasty","killi"};

        System.out.print(art[2].chars().distinct().count());
    }

}
