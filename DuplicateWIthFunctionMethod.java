import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DuplicateWIthFunctionMethod {

    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
       list.add("jithuaaaa");
       list.add("kkklliioop");
       list.add("mickky");
      List<Long> values= list.stream().filter(pred()).map(callFunction()).collect(Collectors.toList());
        System.out.println(values);

    }
    public static Function<String ,Long> callFunction(){
        return s->s.chars().distinct().count();
    }
    public static Predicate<String> pred(){
    //return s->s.chars().mapToObj(c->Character.valueOf((char) c)).filter()
        return null;
    }

}
