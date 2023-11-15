package LinearAndBinarySearch;

import java.util.Scanner;

public class PerfectSquare {
    static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long start = 0;
        long end = num / 2;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid > num) {
                end = mid - num;
            } else if (mid * mid < num) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();

        System.out.println("The given number is a perfect square :" + isPerfectSquare(n));
    }
}
