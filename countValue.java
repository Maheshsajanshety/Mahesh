package Arrays_in_2D;

import java.util.Scanner;

public class countValue {
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
        int positive = 0, negative = 0, even = 0, odd = 0, zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > 0) {
                    positive++;
                }
                if (arr[i][j] < 0) {
                    negative++;
                }
                if (arr[i][j] % 2 != 0) {
                    odd++;
                }
                if (arr[i][j] % 2 == 0) {
                    even++;
                }
                if (arr[i][j] == 0) {
                    zeros++;
                }
            }
        }
        System.out.println("Number of positive numbers =" + positive);
        System.out.println("Number of negative numbers =" + negative);
        System.out.println(" Number of odd numbers =" + odd);
        System.out.println("Number of even numbe =" + even);
        System.out.println("Number of 0 =" + zeros);
    }
}
