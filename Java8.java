import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Java8 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> list1=list.stream().filter(s->s%2!=0).collect(Collectors.toList());
        list1.forEach(System.out::print);
        int value = list.stream().filter(s -> s % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(value);

/*
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5); Integer sum = integers.stream() .reduce(0, Integer::sum);
        integers.stream().filter(x->x%2!=0) .reduce(0, Integer::sum);
        integers.stream() .filter(x->x%2==0).maptoInt(s->s).average();
        integers.stream() .collect(Collectors.summingInt(Integer::intValue));*/

    }


}
