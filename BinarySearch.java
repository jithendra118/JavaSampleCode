/**
 * recursive approach
 */
public class BinarySearch {

    private int binarySearch(int arr[],int left,int right,int searchValue){
        int mid = left+(right-1)/2;
        if (right >= left) {
            if (arr[mid] == searchValue) {
                return mid;
            }
            if (arr[mid] > searchValue) {
                return this.binarySearch(arr, left, mid - 1, searchValue);
            } else {
                return this.binarySearch(arr, mid + 1, right, searchValue);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int a[]= {1,2,4,5,6,7,8,9,0};
        int left =0;
        int right= a.length-1;
        int searchValue= 5;
        BinarySearch search = new BinarySearch();
        System.out.println(search.binarySearch(a,left,right,searchValue));
    }
}
