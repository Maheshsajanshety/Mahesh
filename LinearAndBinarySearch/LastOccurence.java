import java.util.Scanner;

public class LastOccurence {
    public static int lastOccurrence(int[] nums, int low, int high  , int target){
        int answer = -1;
         while(low <= high){
             int mid = low + (high  - low)/2;
             
             if(nums[mid] == target){
                 answer = mid;
                 low = mid + 1;  //if you found the target or if target is greater than the current element, to find last occurrence move to right half of the array
             }
             else if(nums[mid] > target){
                 high  = mid - 1; 
             }
             else low = mid + 1;
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

        System.out.println("Enter the target value :");
        int target=sc.nextInt();
        System.out.println("The last occurrence of target is at index : " + lastOccurrence(arr , 0 , n - 1 , target));
    }
}
