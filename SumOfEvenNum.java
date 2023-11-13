package Arrays1D2D;

public class SumOfEvenNum {
    public static void main(String[] args) {
        int arr[]={3,20,4,6,9};
        int n=arr.length;
        int i=0;
        int sum=0;
        while (i<n) {
            sum+=arr[i];
            i+=2;
        }
        System.out.println("Sum of even number is :"+sum);
    }
}
