package Sorting1;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){ 
                if(arr[j]<arr[min_idx]){
                min_idx=j;
                }
            }
            if(min_idx != i){
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,6,5,2,9,8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
