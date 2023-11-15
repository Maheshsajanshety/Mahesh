package Sorting1;
import java.util.Arrays;


class BubbleSort{
    public static void bubblesort(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,7,6,2,3,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}