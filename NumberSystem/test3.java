package NumberSystem;

import java.util.Scanner;

public class test3 {
    static int findOddOccuring(int[] arr){
        int xor=0;
        for(int i:arr){
            xor=xor ^ i;
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element you want to store  :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of an Array :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("the odd occuring element is "+findOddOccuring(arr));
    }
}
