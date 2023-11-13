package Arrays_in_2D;

import java.util.Scanner;

public class displayPriSecDiag {
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
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                } else if ((i + j) == (arr[0].length - 1)) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
