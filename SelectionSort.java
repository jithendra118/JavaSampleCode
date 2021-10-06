/**
 *  selected sort program
 */
import java.util.*;
public class SelectionSort {

   static  void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static List<Integer> frequencyOfMaxValue(List<Integer> numbers, List<Integer> q){
        int max = 0;
       List<Integer> ret = new ArrayList<>();
       Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<q.size();i++) {
            max =0;
            int count = 0;
            int flag = 0;
            for (int j=q.get(i);j<=numbers.size();j++) {
                int temp = numbers.get(j-1);
                if(temp>max){
                    max = temp;
                     flag =1;
                    count =1;
                }
                else if(temp == max){
                    count = count+1;
                }

            }
            ret.add(count);
        }
        return ret;
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,64,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        List<Integer> temp = new ArrayList<>();
                temp.add(64);//2
                temp.add(25);//1
                temp.add(64);//1
                temp.add(12);//2
                temp.add(22);//2
                temp.add(12);//1
                temp.add(12);//1
                temp.add(22);//1
                temp.add(2);//1
        List<Integer> q = new ArrayList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        List<Integer> value = frequencyOfMaxValue(temp,q);
        value.stream().forEach(System.out::println);
    }
}
