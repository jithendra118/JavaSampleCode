import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    private void sort(int arr[]){
        int temp =0;
        for (int i=0;i<arr.length-1;i++){
            for (int j= 0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    temp = arr[j+1];
                    arr[j+1] =arr[j] ;
                    arr[j]=temp;
                }
            }
        }
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
        BubbleSort ob = new BubbleSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);

    }
}
