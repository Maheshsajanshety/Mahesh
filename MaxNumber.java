package Arrays1D2D;

public class MaxNumber {
    public static void main(String[] args) {
        int arr[]={10,20,33,55,15,25,30};
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            max=Math.max(max, num);
        }
        System.out.println("The max value in an array is :"+max);
    }
}
