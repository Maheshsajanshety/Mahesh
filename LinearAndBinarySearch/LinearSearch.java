package LinearAndBinarySearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to store :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter element in an array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (idx == arr[i]) {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            System.out.println(idx);
        } else {
            System.out.println("Element is not found in an array");
        }

    }
}
