import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListRemove {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
       /* for (Integer a: number) {
            System.out.println("trest"+a);
            if(a==2){
                number.remove(a); // it work
                //number.add(4); // concurrent exception
            }
        }*/


        ///
        ListIterator<Integer> ltr = number.listIterator();

        // Checking the next element availability
        while (ltr.hasNext()) {

            // Moving cursor to the next element
            int i = (Integer)ltr.next();

            // Performing add, remove, and
            // replace operation
            if (i == 2)
                ltr.remove();

            else if (i == 3) // add value after 3
                ltr.add(60);

            else if (i == 4)
                ltr.set(100); //  update 4 with 100
        }

        System.out.println(number);



        ///

        Iterator<Integer> it = number.iterator();
        while (it.hasNext()) { // concurrentModification exception
            Integer value = it.next();
            System.out.println("List Value:" + value);
            if (value==3) {
                it.remove(); // it will work
            }
        }

        number.stream().forEach(System.out::println);
    }
}
