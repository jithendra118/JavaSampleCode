public class NonRecuBinarySearch {
    public static void main(String[] args) {

        int a[]= {1,2,4,5,6,7,8,9,0};
        int left =0;
        int right= a.length-1;
        int searchValue= 5;
        NonRecuBinarySearch search = new NonRecuBinarySearch();
        System.out.println(search.binarySearch(a,left,right,searchValue));
    }
    private int binarySearch(int arr[],int left,int right,int searchValue){
        int mid = left+(right-1)/2;
        while(left<=right){
            if (arr[mid] == searchValue) {
                return mid;
            }
            if (arr[mid] > searchValue) {
                right = mid-1;
            } else {
               left = mid+1;
            }
        }
        return -1;
    }
}
