import javax.xml.stream.events.Characters;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;

public class DuplicateValuesCalInString {
    public static void main(String[] args) {
        String s = "kkkkmmmmssszzzaabbbcccdddCCCCCCDDDDD";
        Map<Character, Long> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            //s=s.toLowerCase(Locale.ROOT);
            String key = Character.toString(s.charAt(i));
            Character cha = s.charAt(i);
            long count = s.chars().map(m->Character.toLowerCase(m)).filter(c -> c == cha).count(); //working
           // long count = s.chars().mapToObj(m->Character.valueOf(((char)Character.toLowerCase(m)))).filter(c -> c == cha).count();
            List<Character> ch =s.chars().mapToObj(m->Character.valueOf(((char)Character.toLowerCase(m)))).collect(Collectors.toList());
            System.out.println("-------------------------------------------------------");
            ch.forEach(System.out::println);
            System.out.println("-------------------------------------------------------");
            if(!Character.isUpperCase(cha))
                map.put(cha,count);
            // map.compute(key,(k,v)->)
           /* public static int countRepeatedCharactersWithJava8(String text, char character){
                return (int) text.chars().filter(c-> c==character).count();
            }*/

        }
        System.out.println("-------------------------------------------------------");
        map.entrySet().stream().sorted(comparingByKey()).forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        map.entrySet().stream().sorted(comparingByValue()).forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
    }
}
