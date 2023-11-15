package LinearAndBinarySearch;

import java.util.Scanner;

public class RepeatNumber {
    public static int repeatedNumber(int[] a, int low, int high){
        int answer = -1;
          while(low <= high){
              int mid = low + (high - low)/2;
  
              if(a[mid] > mid)low = mid + 1;
              else {
                  answer = a[mid];
                  high = mid - 1;
              }
          }
       return answer;
      }
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to store :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter element in an array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The repeated number in the given array is " + repeatedNumber(arr , 0 , n - 1));
      }
}
