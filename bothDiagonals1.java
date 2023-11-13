package Arrays_in_2D;

import java.util.Scanner;

public class bothDiagonals1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int m = sc.nextInt();
        System.out.println("Enter the number of colums :");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the element in an array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Element both diagonal are as fallows :");
        // optimize aproch is Timecomplexity :O(n)
        for (int i = 0; i < arr.length; i++) {
            if (i == i) {
                System.out.print(arr[i][i]);
            }
            if (i != arr.length - 1 - i) {
                System.out.print(arr[i][arr.length - 1 - i]);
            }
        }
    }
}
