package Sorting1;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,2,9,7,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
