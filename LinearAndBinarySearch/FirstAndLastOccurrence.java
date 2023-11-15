package LinearAndBinarySearch;

import java.util.Scanner;

public class FirstAndLastOccurrence {
    static int lastOccurence(int[] arr, int low, int high, int target) {
        int answer = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                answer = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }

    static int firstOccurence(int[] arr, int low, int high, int target) {
        int answer = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                answer = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number elements you want to add");
        int n=sc.nextInt();

        int[] nums=new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }

        System.out.println("Enter the target value :");
        int target=sc.nextInt();

        int first=firstOccurence(nums, 0, n-1, target);
        int last=lastOccurence(nums, 0, n-1, target);

        if(first==last && first==-1){
            System.out.println("The target does not exit in an array.");
        }else{
            System.out.println("The frequency of target in the given array is "+(last-first+1)+"time/times");
        }

    }
}
