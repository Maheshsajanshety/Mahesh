package Arrays_in_2D;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of rows :");
       int m=sc.nextInt();
       System.out.println("Enter the number of colums :");
       int n=sc.nextInt();
       int[][] arr=new int[m][n];
       System.out.println("Enter the element in an array : ");
       for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            arr[i][j]=sc.nextInt();
        }
       }
       int max=Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
           max =Math.max(max, arr[i][j]);
        }
       }
       System.out.println("Array in max value is :"+max);
    }
}
