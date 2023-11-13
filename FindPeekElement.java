package Arrays1D2D;

/**
 * test
 */
public class FindPeekElement {

    public static void main(String[] args) {
        int arr[]={1,7,3,4,5,6};
        int n=arr.length;
        for (int i = 1; i < n-1; i++) {
            if(arr[i-1]<arr[i] &&arr[i]>arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}