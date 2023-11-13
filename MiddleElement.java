package Arrays_in_2D;

import java.util.Scanner;

public class MiddleElement {
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
        int x=arr.length;
        int y=arr[0].length;
        System.out.println("the element middle of rows and colums :");
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i][y/2]+" ");
        }
            for (int j = 0; j < y; j++) {
                if(j==y/2)  continue;
                  System.out.print(arr[x/2][j]+" ");
            }
        }
}
