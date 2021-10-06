import com.sun.jdi.LongValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreaOfBOx {


    public static void main(String[] args) {
    /*    List<Integer> w = new ArrayList<Integer>();
        List<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>(); //Use Arraylist inside

        for(int i=1;i<10; i++){
            w.add(i);
            a.add(new ArrayList(w));
        }

        //System.out.println(w);
        System.out.println(a);
    }*/
        List<List<Integer>> a = new ArrayList();
        List<Long> lonList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            // your logic here make use of Arrays.asList()
            a.add(Arrays.asList(i, i + 1));
        }
        for (int i = 0; i <a.size() ; i++) {
            List<Integer> tmp = a.get(i);
            int mul =0;
            int var1  = tmp.get(0);
            int var2 = tmp.get(1);
            while(var1!=0 && var2!=0){
                mul+=var1*var2;
                var1 = var1-1;
                var2 = var2-1;
            }
            lonList.add(Long.valueOf(mul));

        }
    }
}
