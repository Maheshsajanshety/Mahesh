package NumberSystem;

import java.util.Scanner;

public class test2 {
    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Integer Number :");
        int number=sc.nextInt();
        int ans=countSetBits(number);
        System.out.println("The number of set bits in the given number are :"+ans);
    }
}
