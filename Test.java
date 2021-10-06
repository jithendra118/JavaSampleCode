import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
     /*   List<LinkedList> liste  = new ArrayList<>();
        for (int i = 0; i < 1200; i++) {
            LinkedList li = new LinkedList("ram","IT");
            liste.add(li);
        }*/
    List<String> list = new ArrayList<>();
    list.add("aaabbb");
    list.add("aam");
    list.add("bmm");
    list.add("acc");
    list.add("ueujeue");
    list = list.stream().filter(filterWitha().or(filterWithlength())).collect(Collectors.toList());
    list.stream().forEach(System.out::println);

    }
    private static Predicate<String> filterWitha(){
        return s -> s.startsWith("a");
    }
    private static Predicate<String> filterWithlength(){
        return s -> s.length()==7;
    }
}
